package ua.training.controllers;

import ua.training.models.Group;
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
    private static final String REGEX_USERNAME = "^(?=.{4,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
    private static final String REGEX_GROUP = "[Rr]elatives|[Ff]riends|[Cc]olleagues|[Oo]thers";
    private static final String REGEX_HOME_PHONE_NUMBER = "^0-\\d{3}-\\d{6}$";
    private static final String REGEX_CELL_PHONE_NUMBER = "^0\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
    private static final String REGEX_EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    private static final String REGEX_SKYPE = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,31}";


    public NoteController(Note model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        view.showMessage(View.WELCOME_MESSAGE);

        view.showMessage(View.LAST_NAME_MESSAGE);
        model.setLastName(readUserInput(scanner, REGEX_NAME));

        view.showMessage(View.FIRST_NAME_MESSAGE);
        model.setFirstName(readUserInput(scanner, REGEX_NAME));

        view.showMessage(View.MIDDLE_NAME_MESSAGE);
        model.setMiddleName(readUserInput(scanner, REGEX_NAME));

        view.showMessage(View.USERNAME_MESSAGE);
        model.setUsername(readUserInput(scanner, REGEX_USERNAME));

        view.showMessage(View.COMMENT_MESSAGE);
        model.setComment(readUserInput(scanner, ".*"));

        view.showMessage(View.GROUP_MESSAGE);
        model.setGroup(Group.valueOf(readUserInput(scanner, REGEX_GROUP).toUpperCase()));

        view.showMessage(View.HOME_PHONE_MESSAGE);
        model.setHomePhone(readUserInput(scanner, REGEX_HOME_PHONE_NUMBER));

        view.showMessage(View.CELL_PHONE_MESSAGE);
        model.setCellPhone(readUserInput(scanner, REGEX_CELL_PHONE_NUMBER));

        view.showMessage(View.OPTIONAL_CELL_PHONE_MESSAGE);
        model.setCellPhoneOptional(readUserInput(scanner, REGEX_CELL_PHONE_NUMBER));

        view.showMessage(View.EMAIL_MESSAGE);
        model.setEmail(readUserInput(scanner, REGEX_EMAIL));

        view.showMessage(View.SKYPE_MESSAGE);
        model.setSkype(readUserInput(scanner, REGEX_SKYPE));

        view.showMessage(View.ADDRESS_MESSAGE);
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
