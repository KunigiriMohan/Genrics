import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MaxnumberTest {

    @Test
    void max() {
        Maxnumber maxnumber= new Maxnumber();
                        //giving inputs to test case
        assertEquals(200,maxnumber.max(50,200,100,0));                                //checking maximum value is at correct index.
    }
}