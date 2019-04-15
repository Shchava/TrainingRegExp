package ua.trainig.controller;

import ua.trainig.model.NoteBook;

public class SameLoginException extends Exception{
    NoteBook repeated;
    SameLoginException(String message, NoteBook repeated){
        super(message);
        this.repeated = repeated;
    }
}
