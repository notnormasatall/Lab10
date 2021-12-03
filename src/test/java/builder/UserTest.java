package builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUser() {
        User user = User.builder().firstName("Taras").occupation("Teacher").build();
        assertEquals(user.toString(), "User(firstName=Taras, secondName=null, age=0, occupations=[Teacher])");
    }
}