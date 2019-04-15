package ua.trainig.controller;

import ua.trainig.model.NoteBook;
import ua.trainig.view.TextConstants;
import ua.trainig.view.View;

import java.util.Scanner;

public class inputNoteBook {
    Scanner sc;
    View view;
    public inputNoteBook(Scanner scanner, View view) {
        sc = scanner;
        this.view =  view;
    }
    public NoteBook readNoteBook () {
        view.printInputInvitation(TextConstants.NOTEBOOK);

        String login = readLogin();
        String name = readName();
        String surname = readSurname();

        return new NoteBook(login,name,surname);
    }

    private String readLogin(){
        return readValue(TextConstants.LOGIN,RegExpressions.LOGIN);
    }

    private String readName(){
        return readValue(TextConstants.NAME,RegExpressions.NAME_UA);
    }

    private String readSurname(){
        return readValue(TextConstants.SURNAME,RegExpressions.SURNAME_UA);
    }

    private String readValue(String value, String format){
        String res = "";
        view.printInputInvitation(value);
        while (! (sc.hasNextLine()&&(res = sc.nextLine()).matches(format))){
            view.printWrongInput(value,format);
        }
        return res;
    }
}
