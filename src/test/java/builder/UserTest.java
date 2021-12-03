package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = User.builder().firstName("Taras").occupation("Teacher").build();
    }

    @Test
    void testUser() {
        assertEquals(user.toString(), "User(firstName=Taras, secondName=null, age=0, occupations=[Teacher])");
    }
}