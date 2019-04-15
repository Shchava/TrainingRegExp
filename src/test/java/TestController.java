import org.junit.jupiter.api.Test;
import ua.trainig.controller.Controller;
import ua.trainig.model.Model;
import ua.trainig.model.NoteBook;
import ua.trainig.view.View;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestController {
    Model testModel = new Model();
    View testView = new View();
    Controller testController;

    String TestInputData = "login\nІмя\nПрізвище";
    String untrimmedTestInputLogin = "login  \n  Імя  \n   Прізвище";
    String inputDataWithWrongNames = "login  \n  Імя'  \n Ім''' \n Імыыы  \n імя \n \n Імя \n   Прізвище";


    @Test
    void TestInput(){

        testController = new Controller(testView,testModel,new Scanner(TestInputData));
        testController.process();

        NoteBook inserted =  testModel.getNoteBook("login");

        assertTrue(inserted.getLogin().equals("login"));
        assertTrue(inserted.getName().equals("Імя"));
        assertTrue(inserted.getSurName().equals("Прізвище"));
    }

    @Test
    void testInputWithSpaces(){
        testController = new Controller(testView,testModel,new Scanner(untrimmedTestInputLogin));
        testController.process();

        NoteBook inserted =  testModel.getNoteBook("login");

        assertEquals("login", inserted.getLogin());
        assertEquals("Імя", inserted.getName());
        assertEquals("Прізвище", inserted.getSurName());
    }

    @Test
    void testInputWithErrors(){
        testController = new Controller(testView,testModel,new Scanner(inputDataWithWrongNames));
        testController.process();

        NoteBook inserted =  testModel.getNoteBook("login");

        assertEquals("login", inserted.getLogin());
        assertEquals("Імя", inserted.getName());
        assertEquals("Прізвище", inserted.getSurName());
    }
}
