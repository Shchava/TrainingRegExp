package ua.trainig.model;


import java.util.HashMap;
import java.util.Map;

public class Model {
    private Map<String,NoteBook> noteBookMap = new HashMap<String, NoteBook>();

    public Model(){
    }

    public void addNoteBook(NoteBook book){
        noteBookMap.put(book.getLogin(),book);
    }

    public NoteBook getNoteBook(String login){
        return noteBookMap.get(login);
    }
}
