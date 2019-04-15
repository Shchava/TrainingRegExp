package ua.trainig.controller;

import ua.trainig.model.NoteBook;

public class SameLoginException extends Exception{
    NoteBook repeated;
    public SameLoginException(String message, NoteBook repeated){
        super(message);
        this.repeated = repeated;
    }
    public SameLoginException(NoteBook repeated){
        this.repeated = repeated;
    }
}
