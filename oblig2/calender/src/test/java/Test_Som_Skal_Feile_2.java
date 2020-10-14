
import no.kristoss.myCalender.Calender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Som_Skal_Feile_2 {
        @Test()
        public void test_Som_Skal_Feile_2(){
            int year = 2000;
            Calender sut = new Calender();
            boolean actual = sut.isLeapYear(year);
            boolean expected = false;

            Assertions.assertEquals(expected, actual);
//            Denne skulle fått at det er et skuddår om dette hadde vært satt for å teste false.
        }




}
