package ua.training;

import ua.training.controllers.NoteController;
import ua.training.models.Note;
import ua.training.views.View;

/**
 * Main class
 *
 */
public class App {

    public static void main(String[] args) {
        Note model = new Note();
        View view = new View();
        NoteController controller = new NoteController(model, view);
        controller.processUser();
    }

}
