package application;

import java.util.HashMap;
import java.util.Map;

public class Listdatabase {

    private String voornaam;
    private String achternaam;

    private Map<String, Listdatabase> listdatabase = new HashMap<>();

    public Listdatabase(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    private void addToList(Listdatabase listdatabase){
        this.listdatabase.put(voornaam, listdatabase);
    }

    public int letSeeTheList(){
        return listdatabase.size();
    }

}