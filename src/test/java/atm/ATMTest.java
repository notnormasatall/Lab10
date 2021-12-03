package atm;

import static org.junit.Assert.*;
import org.junit.Test;


public class ATMTest {

    @Test
    public void testAttributes() {
        ATM atm = new ATM();
        assertEquals(atm.first.getNOMINAL(), 20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void processInvalid() {
        ATM atm = new ATM();
        atm.process(126);
    }

    @Test
    public void processCorrect() {
        ATM atm = new ATM();
        atm.process(125);
    }
}