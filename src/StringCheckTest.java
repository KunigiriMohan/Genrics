import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckTest {
/*
* Test Case for checking method
* */
    @Test
    void max() {
        StringCheck stringCheck= new StringCheck();
        //giving inputs to test case
        assertEquals("peach",stringCheck.max("apple","peach","banana",0));
        assertEquals("peach",stringCheck.max("apple","peach","banana",1));
        assertEquals("peach",stringCheck.max("apple","peach","banana",2));//checking maximum value is at correct index.
    }
}