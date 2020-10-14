import no.kristoss.myCalender.*;
import org.junit.jupiter.api.*;

public class Tester_true_4 {


    @Test()
    public void tester_true_4(){
        int year = 4;
        Calender sut = new Calender();
        boolean actual = sut.isLeapYear(year);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}
