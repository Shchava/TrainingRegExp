package ua.trainig.model;


import java.util.ArrayList;
import java.util.List;

public class Model {
    List<NoteBook> noteBookList = new ArrayList<NoteBook>();

    public Model(){
    }

    public void addNoteBook(NoteBook book){
        noteBookList.add(book);
    }
}
