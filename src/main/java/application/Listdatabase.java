package application;

import java.util.HashMap;
import java.util.Map;

public class Listdatabase {

    private Map<Integer, AccountCredentials> database = new HashMap<>();

//    public void accountAddToList(String voornaam, String achternaam){
//
//        this.database.put(1, listdatabase);
//    }


    public int createAccountForUser(String voornaam, String achternaam){

    AccountCredentials user = new AccountCredentials(voornaam, achternaam);
        this.database.put(0, user);
        return 0;
    }

    public AccountCredentials getAccountForUser(int number){
        return database.get(number);
    }
}