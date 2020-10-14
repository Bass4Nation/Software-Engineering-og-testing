import no.kristoss.myCalender.Calender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tester_false_1500 {
    @Test()
    public void tester_false_1500(){
        int year = 1500;
        Calender sut = new Calender();
        boolean actual = sut.isLeapYear(year);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }


}
