package application;

import java.util.HashMap;
import java.util.Map;

public class Listdatabase {

    private String voornaam;
    private String achternaam;

    private Map<Integer, Listdatabase> database = new HashMap<>();

    public Listdatabase(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        System.out.println("Ben er voor bij met " + voornaam + " $ " + achternaam);
    }

    public void addToList(Listdatabase listdatabase){
        this.database.put(1, listdatabase);
    }

    public Listdatabase letSeeTheList(int number){
//        Listdatabase listdatabase  =  database.get(number);
//        System.out.println(listdatabase);
        return database.get(number);
    }

    public String getVoornaam() {
        return voornaam;
    }
}