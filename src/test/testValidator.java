package test;

import helper.Constants;
import helper.Validator;
import org.junit.Test;
import static org.junit.Assert.*;

public class testValidator {

    @Test
    public void testValidateMenuChoice() {
        assertTrue(Validator.validateMenuChoice(Constants.PLAY_HUMAN));
        assertTrue(Validator.validateMenuChoice(Constants.PLAY_COMPUTER));
        assertTrue(Validator.validateMenuChoice(Constants.HISTORY));
        assertTrue(Validator.validateMenuChoice(Constants.QUIT));
        assertFalse(Validator.validateMenuChoice(""));
        assertFalse(Validator.validateMenuChoice("abcdef12345"));
    }

    @Test
    public void testValidatePlayerChoice() {
        assertTrue(Validator.validatePlayerChoice(Constants.ROCK));
        assertTrue(Validator.validatePlayerChoice(Constants.PAPER));
        assertTrue(Validator.validatePlayerChoice(Constants.SCISSORS));
        assertTrue(Validator.validatePlayerChoice(Constants.QUIT));
        assertFalse(Validator.validatePlayerChoice(""));
        assertFalse(Validator.validatePlayerChoice("abcdef12345"));
    }
}
