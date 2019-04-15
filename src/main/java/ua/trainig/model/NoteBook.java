package ua.trainig.model;

public class NoteBook {
    private String login;
    private String name;
    private String surName;


    public NoteBook(String login, String name, String surname){
        this.login = login;
        this.name = name;
        this.surName = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getLogin() {
        return login;
    }


}
