import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ua.trainig.controller.Controller;
import ua.trainig.model.Model;
import ua.trainig.model.NoteBook;
import ua.trainig.view.View;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestController {
    Model testModel = new Model();
    View testView = new View();
    Controller testController;

    String TestInputData = "login \n Імя \n Прізвище";


    @Test
    @Disabled
    void TestInput(){

        testController = new Controller(testView,testModel,new Scanner(TestInputData));
        testController.process();

        NoteBook inserted =  testModel.getNoteBook("login");

        assertTrue(inserted.getLogin().equals("login"));
        assertTrue(inserted.getName().equals("Імя"));
        assertTrue(inserted.getSurName().equals("Прізвище"));
    }
}
