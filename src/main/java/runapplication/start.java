package runapplication;

import application.Listdatabase;

public class start {

    public static void main(String[] args){

        Listdatabase object1 = new Listdatabase("Snoep", "Dog");

        object1.addToList(object1);


        Listdatabase eruitgehaald = object1.letSeeTheList(1);

        System.out.println(eruitgehaald);

        System.out.println(eruitgehaald.getVoornaam());
    }

}
