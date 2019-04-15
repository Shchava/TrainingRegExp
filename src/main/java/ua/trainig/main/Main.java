package ua.trainig.main;

import ua.trainig.controller.Controller;
import ua.trainig.model.Model;
import ua.trainig.view.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);

        controller.process();
    }
}
