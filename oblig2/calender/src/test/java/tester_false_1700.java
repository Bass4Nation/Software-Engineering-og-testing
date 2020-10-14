import no.kristoss.myCalender.*;
import org.junit.jupiter.api.*;

public class tester_false_1700 {
    @Test()
    public void tester_false_1700(){
        int year = 1700;
        Calender sut = new Calender();
        boolean actual = sut.isLeapYear(year);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }


}
