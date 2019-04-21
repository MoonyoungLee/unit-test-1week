import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void nullInput(){
        String str = null;
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
        assertThat(result, is(0));
    }

    @Test
    public void emptyInput(){
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void upperCase_ABC(){
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);
        assertTrue(result == 3);
    }

    @Test
    public void upperAndLower_ABCdefGHI(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);
        assertThat(result, is(6));
        assertTrue(result == 6);
        assertFalse(result == 10);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void throwExceptionWhenGetZeroIndex(){
        new ArrayList<Object>().get(0);
    }

    //@Ignore
    @Test(timeout = 5000)
    public void testShouldRunInLimitedTime() throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("제한된 시간 내에 수행되면 테스트 Passed!");
    }
}