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
    String inputDataWithWrongNames = "login  \n  Імя'  \n Ім''' \n Імыыы  \n імя \n \n Імя \n   Прізвище";
    String doubleLoginInput = "login  \n  Імя  \n   Прізвище \n login  \n  Імя  \n   Прізвище \n login2";


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

    @Test
    void testLoginInputWithErrors(){
        inputNoteBook testNoteBook = new inputNoteBook(new Scanner(inputDataWithWrongNames),testView);
        NoteBook resp =   testNoteBook.readNoteBook();
        assertEquals("login", resp.getLogin());
        assertEquals("Імя", resp.getName());
        assertEquals("Прізвище", resp.getSurName());
    }
    @Test
    void testDoubleLoginInput(){
        inputNoteBook testNoteBook = new inputNoteBook(new Scanner(doubleLoginInput),testView);
        NoteBook resp =   testNoteBook.readNoteBook();
        NoteBook resp2 =  testNoteBook.readNoteBook();
        assertEquals("login", resp.getLogin());
        assertEquals("Імя", resp.getName());
        assertEquals("Прізвище", resp.getSurName());

        assertEquals("login", resp2.getLogin());
        assertEquals("Імя", resp2.getName());
        assertEquals("Прізвище", resp2.getSurName());
    }
}
