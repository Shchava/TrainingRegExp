package ua.trainig.model;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Model {
    private Map<String,NoteBook> noteBookMap = new HashMap<String, NoteBook>();

    public Model(){
    }

    public void addNoteBook(NoteBook book){
        noteBookMap.put(book.getLogin(),book);
    }
}
