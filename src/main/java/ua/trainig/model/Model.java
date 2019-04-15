package ua.trainig.model;


import ua.trainig.controller.SameLoginException;

import java.util.HashMap;
import java.util.Map;

public class Model {
    private Map<String,NoteBook> noteBookMap = new HashMap<String, NoteBook>();

    public Model(){
    }

    public void addNoteBook(NoteBook book) throws SameLoginException {
        if(noteBookMap.containsKey(book.getLogin())){
            throw new SameLoginException(book);
        }else {
            noteBookMap.put(book.getLogin(), book);
        }
    }

    public NoteBook getNoteBook(String login){
        return noteBookMap.get(login);
    }
}
