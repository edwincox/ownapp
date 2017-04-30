package runapplication;

import application.AccountCredentials;
import application.Listdatabase;

public class start {

    public static void main(String[] args){

        Listdatabase object1 = new Listdatabase();

        object1.createAccountForUser("Edwin", "Cox");


        AccountCredentials eruitgehaald = object1.getAccountForUser(12);

        System.out.println(eruitgehaald.getVoornaam());

        System.out.println(eruitgehaald.getAchternaam());
    }

}