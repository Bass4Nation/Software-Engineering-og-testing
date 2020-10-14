import no.kristoss.myCalender.*;
import org.junit.jupiter.api.*;

public class Tester_true_2000 {
    @Test()
    public void tester_true_2000(){
        int year = 2000;
        Calender sut = new Calender();
        boolean actual = sut.isLeapYear(year);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }


}
