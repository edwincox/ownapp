package application;

public class Addnewusertothelist {

    private String voornaam;
    private String achternaam;

    public Addnewusertothelist(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public void addNewUserIntoTheListDatabase(){
        Listdatabase addNewUserIntoTheListDatabase = new Listdatabase();
        addNewUserIntoTheListDatabase.opslagdata.add(1,addNewUserIntoTheListDatabase);
    }

}
