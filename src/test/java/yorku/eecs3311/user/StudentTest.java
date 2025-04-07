package yorku.eecs3311.user;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudentConstructorEmail() {
        Student student = new Student("student@yorku.ca", "studypass", "s001");
        assertEquals("student@yorku.ca", student.getEmail());
    }

    @Test
    public void testStudentConstructorPassword() {
        Student student = new Student("student@yorku.ca", "studypass", "s001");
        assertEquals("studypass", student.getPwd());
    }

    @Test
    public void testStudentConstructorId() {
        Student student = new Student("student@yorku.ca", "studypass", "s001");
        assertEquals("s001", student.getId());
    }

    @Test
    public void testStudentRate() {
        Student student = new Student("student@yorku.ca", "studypass", "s001");
        double expectedRate = yorku.eecs3311.parking.ParkingRate.STUDENT.getValue();
        assertEquals(expectedRate, student.getRate(), 0.0001);
    }

    @Test
    public void testStudentSetRate() {
        Student student = new Student("student@yorku.ca", "studypass", "s001");
        double newRate = 8.0;
        student.setRate(newRate);
        assertEquals(newRate, student.getRate(), 0.0001);
    }

    @Test
    public void testStudentToString() {
        Student student = new Student("student@yorku.ca", "studypass", "s001");
        String expectedString = "User [email=student@yorku.ca, pwd=studypass, id=s001, rate=" + yorku.eecs3311.parking.ParkingRate.STUDENT.getValue() + "]";
        assertEquals(expectedString, student.toString());
    }
}
