import org.junit.jupiter.api.Test;
import ua.trainig.controller.inputNoteBook;
import ua.trainig.model.NoteBook;
import ua.trainig.view.View;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInputNoteBook {
    View testView = new View();
    String testInputLogin = "login\nІмя\nПрізвище";
    String untrimmedTestInputLogin = "login  \n  Імя  \n   Прізвище";

    @Test
    void testLoginInput(){
        inputNoteBook testNoteBook = new inputNoteBook(new Scanner(testInputLogin),testView);
        NoteBook resp =   testNoteBook.readNoteBook();
        assertEquals("login", resp.getLogin());
        assertEquals("Імя", resp.getName());
        assertEquals("Прізвище", resp.getSurName());
    }

    @Test
    void testLoginInputWithSpaces(){
        inputNoteBook testNoteBook = new inputNoteBook(new Scanner(untrimmedTestInputLogin),testView);
        NoteBook resp =   testNoteBook.readNoteBook();
        assertEquals("login", resp.getLogin());
        assertEquals("Імя", resp.getName());
        assertEquals("Прізвище", resp.getSurName());
    }

}
