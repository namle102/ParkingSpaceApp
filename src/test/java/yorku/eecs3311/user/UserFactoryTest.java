package yorku.eecs3311.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserFactoryTest {

    @Test
    public void testGenerateStudent() {
        User user = UserFactory.generateUser("student", "student@yorku.ca", "password123", "s123");
        assertTrue(user instanceof Student);
        assertEquals("student@yorku.ca", user.getEmail());
        assertEquals("password123", ((Student) user).getPwd());
        assertEquals("s123", user.getId());
    }

    @Test
    public void testGenerateFaculty() {
        User user = UserFactory.generateUser("faculty", "faculty@yorku.ca", "securepass", "f456");
        assertTrue(user instanceof Faculty);
        assertEquals("faculty@yorku.ca", user.getEmail());
        assertEquals("securepass", user.getPwd());
        assertEquals("f456", user.getId());
    }

    @Test
    public void testGenerateStaff() {
        User user = UserFactory.generateUser("staff", "staff@yorku.ca", "staffpass", "st789");
        assertTrue(user instanceof Staff);
        assertEquals("staff@yorku.ca", user.getEmail());
        assertEquals("staffpass", user.getPwd());
        assertEquals("st789", user.getId());
    }

    @Test
    public void testGenerateVisitor() {
        User user = UserFactory.generateUser("visitor", "visitor@yorku.ca", "visitpass", "v001");
        assertTrue(user instanceof Visitor);
        assertEquals("visitor@yorku.ca", user.getEmail());
        assertEquals("visitpass", user.getPwd());
        assertEquals("v001", user.getId());
    }

    @Test
    public void testGenerateUnknownType() {
        User user = UserFactory.generateUser("unknown", "unknown@yorku.ca", "nopass", "u000");
        assertNull(user);
    }

    @Test
    public void testCaseInsensitivity() {
        User user = UserFactory.generateUser("StUdEnT", "case@yorku.ca", "casepass", "c001");
        assertTrue(user instanceof Student);
    }
}
