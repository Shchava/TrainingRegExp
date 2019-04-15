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

    @Override
    public int hashCode() {
        return login.hashCode();
    }

    @Override
    public boolean equals(Object el) {
        if(!(el instanceof NoteBook)){
            return false;
        }
        return ((NoteBook) el).login.equals(login);
    }
}
