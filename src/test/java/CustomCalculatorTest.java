import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {
    //private CustomCalculator cal = new CustomCalculator();

    @Test
    public void 더하기테스트(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void 마이너스테스트(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10,2);
        assertTrue(result == 8);
    }

    @Test
    public void multiplyTest(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.multiply(2, 3);
        assertTrue(result == 6);
    }

    @Test
    public void divideTest(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.divide(15,3);
        assertFalse(result == 4);
        assertThat("result",result, is(5));
    }


}