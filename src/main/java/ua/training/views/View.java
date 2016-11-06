package ua.training.views;

/**
 * Created by Ivan on 06.11.2016.
 */
public class View {

    public static final String WELCOME_MESSAGE = "Hello, please, enter information about subscriber";
    public static final String FIRST_NAME_MESSAGE = "Please, enter first name:";
    public static final String LAST_NAME_MESSAGE = "Please, enter last name:";
    public static final String MIDDLE_NAME_MESSAGE = "Please, enter middle name:";
    public static final String USERNAME_MESSAGE = "Please, enter username:";
    public static final String COMMENT_MESSAGE = "Please, enter comment:";
    public static final String GROUP_MESSAGE = "Please, enter group:";
    public static final String HOME_PHONE_MESSAGE = "Please, enter home phone number:";
    public static final String CELL_PHONE_MESSAGE = "Please, enter cell phone number:";
    public static final String OPTIONAL_CELL_PHONE_MESSAGE = "Please, enter second cell phone number(optional):";
    public static final String EMAIL_MESSAGE = "Please, enter email:";
    public static final String SKYPE_MESSAGE = "Please, enter skype:";
    public static final String ADDRESS_MESSAGE = "Please, enter address:";
    public static final String ZIP_MESSAGE = "Zip:";
    public static final String CITY_MESSAGE = "City:";
    public static final String STREET_MESSAGE = "Street:";
    public static final String HOME_NUMBER_MESSAGE = "Home:";
    public static final String FLAT_NUMBER_MESSAGE = "Flat:";
    public static final String ERROR_MESSAGE = "Wrong input data";

    public void showMessage(String string) {
        System.out.println(string);
    }

}
