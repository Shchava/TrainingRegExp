package ua.trainig.model;


import java.util.HashSet;
import java.util.Set;

public class Model {
    Set<NoteBook> noteBookList = new HashSet<NoteBook>();

    public Model(){
    }

    public void addNoteBook(NoteBook book){
        noteBookList.add(book);
    }
}
