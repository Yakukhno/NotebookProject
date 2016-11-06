package ua.training.controllers;

import ua.training.models.Note;
import ua.training.views.View;

import java.util.Scanner;

/**
 * Created by Ivan on 06.11.2016.
 */
public class NoteController {

    private Note model;
    private View view;

    private static final String REGEX_NAME = "[a-zA-Zа-яА-Я]+";

    public NoteController(Note model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        view.showMessage(View.WELCOME_MESSAGE);

        view.showMessage(View.FIRST_NAME_MESSAGE);
        model.setFirstName(readUserInput(scanner, REGEX_NAME));
        System.out.println(model.getFirstName());

    }

    private String readUserInput(Scanner scanner, String pattern) {
        String userInput = scanner.next();
        if (userInput.matches(pattern)) {
            return userInput;
        } else {
            view.showMessage(View.ERROR_MESSAGE);
            return readUserInput(scanner, pattern);
        }
    }
}
