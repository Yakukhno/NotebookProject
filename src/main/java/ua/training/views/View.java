package ua.training.views;

/**
 * Created by Ivan on 06.11.2016.
 */
public class View {

    public static final String WELCOME_MESSAGE = "Hello, please, enter" +
            " information about subscriber";
    public static final String FIRST_NAME_MESSAGE = "Please, enter first name:";
    public static final String LAST_NAME_MESSAGE = "Please, enter last name:";
    public static final String MIDDLE_NAME_MESSAGE = "Please, enter middle name:";
    public static final String USERNAME_MESSAGE = "Please, enter username(4-20 characters):";
    public static final String COMMENT_MESSAGE = "Please, enter comment(max 200 characters):";
    public static final String GROUP_MESSAGE = "Please, choose group from" +
            " following: Relatives, Friends, Colleagues, Others:";
    public static final String HOME_PHONE_MESSAGE = "Please, enter" +
            " home phone number in format 0-yyy-xxxxxx:";
    public static final String CELL_PHONE_MESSAGE = "Please, enter" +
            " cell phone number in format 0yy-xxx-xx-xx:";
    public static final String ASK_OPTIONAL_CELL_PHONE_MESSAGE = "Do you" +
            " want to enter additional cell phone number? Write 'y', if you want.";
    public static final String OPTIONAL_CELL_PHONE_MESSAGE = "Please, enter" +
            " second cell phone number in format 0yy-xxx-xx-xx::";
    public static final String EMAIL_MESSAGE = "Please, enter email:";
    public static final String SKYPE_MESSAGE = "Please, enter " +
            "skype(5-31 characters):";
    public static final String ADDRESS_MESSAGE = "Please, enter address";
    public static final String POSTAL_CODE_MESSAGE = "Postal code(xxxxx):";
    public static final String CITY_MESSAGE = "City:";
    public static final String STREET_MESSAGE = "Street:";
    public static final String HOUSE_NUMBER_MESSAGE = "House number:";
    public static final String FLAT_NUMBER_MESSAGE = "Flat number:";
    public static final String ERROR_MESSAGE = "Wrong input data, please, enter again:";

    public void showMessage(String string) {
        System.out.println(string);
    }

}
