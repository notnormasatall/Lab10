package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;

    @BeforeEach
    public void setUp() {
        atm = new ATM();
    }

    @Test
    public void testAttributes() {
        assertEquals(atm.first.getNOMINAL(), 20);
    }
}