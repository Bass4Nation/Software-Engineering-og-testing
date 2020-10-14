
import no.kristoss.myCalender.Calender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Som_Skal_Feile_1 {
        @Test()
        public void test_Som_Skal_Feile_1(){
            int year = 1500;
            Calender sut = new Calender();
            boolean actual = sut.isLeapYear(year);
            boolean expected = true;

            Assertions.assertEquals(expected, actual);
//            Denne skulle fått at det er et skuddår om dette hadde vært satt for å teste sant.
        }




}
