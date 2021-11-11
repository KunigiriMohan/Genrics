import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MaxnumberTest {

    @Test
    void max() {
        Maxnumber maxnumber= new Maxnumber();
                        //giving inputs to test case
        assertEquals(2.8,maxnumber.max(2.2,2.8,2.0,0));                                //checking maximum value is at correct index.
    }
}