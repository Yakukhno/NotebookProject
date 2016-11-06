package ua.training;

import org.junit.Test;
import org.junit.Assert;
import ua.training.controllers.NoteController;
import ua.training.models.Note;
import ua.training.views.View;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Method test method createFullName() from class Note
     */
    @Test
    public void testCreateFullName() {
        Note model = new Note();
        model.setFirstName("Ivan");
        model.setLastName("Petrov");
        model.createFullName();
        Assert.assertEquals("Petrov I.", model.getFullName());
    }

    /**
     * Method test method isUserInputYesOrNo() from class NoteController
     */
    @Test
    public void testIsUserInputYesOrNo() {
        NoteController controller = new NoteController(new Note(), new View());
        Assert.assertTrue(controller.isUserInputYesOrNo(new Scanner("y")));
    }

    /**
     * Method test method readUserInput() from class NoteController
     */
    @Test
    public void testReadUserInput() {
        NoteController controller = new NoteController(new Note(), new View());
        String string = "abcd";
        Assert.assertEquals(controller.readUserInput(new Scanner(string),
                "a[bc]{2}d"), string);
    }


}
