package exam1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exam01Test {

    Exam01 exam01 = new Exam01();

    @Test
    public void inputIs8() {
        long actualResult = exam01.findInteger(8);
        assertEquals(8, actualResult);
    }

    @Test
    public void inputIs9() {
        long actualResult = exam01.findInteger(10);
        assertEquals(9, actualResult);
    }
}
