package ua.trainig.controller;


import ua.trainig.model.Model;
import ua.trainig.model.NoteBook;
import ua.trainig.view.View;

import java.util.Scanner;

public class Controller {
    private Scanner scanner;
    inputNoteBook inputBook;

    private View view;
    private Model model;

    public Controller(View view,Model model){
        this.view = view;
        this.model = model;
        scanner = new Scanner(System.in);
        inputBook = new inputNoteBook(scanner,view);
    }

    public Controller(View view,Model model,Scanner input){
        this.view = view;
        this.model = model;
        scanner = input;
        inputBook = new inputNoteBook(scanner,view);
    }

    public void process(){
        for(int i = 0; i < 1; i++) {
            NoteBook book = inputBook.readNoteBook();
            addNoteBookToModel(book);
        }
    }
    private void addNoteBookToModel(NoteBook book){
        try {
            model.addNoteBook(book);
        }catch (SameLoginException ex){
            addNoteBookToModel(inputBook.reReadLogin(ex.getRepeated()));
        }
    }
}
