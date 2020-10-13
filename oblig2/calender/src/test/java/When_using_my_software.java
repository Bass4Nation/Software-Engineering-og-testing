import no.kristoss.myCalender.*;
import org.junit.jupiter.api.*;

public class When_using_my_software {
    @Test()
    public void i_get_a_nice_message(){
        Calender sut = new Calender();
        String actual = sut.message();
        Assertions.assertEquals("Hello!", actual);
    }
}
