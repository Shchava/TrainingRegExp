package ua.trainig.controller;


import ua.trainig.model.Model;
import ua.trainig.view.View;

import java.util.Scanner;

public class Controller {
    private Scanner scanner;

    private View view;
    private Model model;

    public Controller(View view,Model model){
        this.view = view;
        this.model = model;
        scanner = new Scanner(System.in);
    }

    public void process(){
        inputNoteBook input = new inputNoteBook(scanner,view);
        for(int i = 0; i < 10; i++) {
            model.addNoteBook(input.readNoteBook());
        }
    }
}