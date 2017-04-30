package Controller;


import application.AccountCredentials;
import application.Listdatabase;

public class Controller {

    Listdatabase objectvoordedatabase = new Listdatabase();


    public void createAccountForUser(String voornaam, String achternaam)
    {
    objectvoordedatabase.createAccountForUser(voornaam, achternaam);
    }

    public AccountCredentials getAccountForUser(int number){
        AccountCredentials gegevens = objectvoordedatabase.getAccountForUser(number);
        return gegevens;
    }

}
