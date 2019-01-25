import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    public void sumOfTwoNumTest(){
        assertTrue(new HelloWorld().sumOfTwoNum(2,4)==6);
    }
}
