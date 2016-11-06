package ua.training;

import ua.training.controllers.NoteController;
import ua.training.models.Note;
import ua.training.views.View;

/**
 * The main class.
 * @version 1.0
 * @author Ivan Yakukhno
 */
public class App {

    /**
     * Main method
     * @param args console arguments
     */
    public static void main(String[] args) {
        Note model = new Note();
        View view = new View();
        NoteController controller = new NoteController(model, view);
        controller.processUser();
    }

}
