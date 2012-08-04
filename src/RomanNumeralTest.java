import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void TestI(){
        RomanNumeralCalculator rnc = new RomanNumeralCalculator();
        int actual = rnc.Convert("I");
        assertEquals(1, actual);
    }
    @Test
    public void TestV(){
        RomanNumeralCalculator rnc = new RomanNumeralCalculator();
        int actual = rnc.Convert("V");
        assertEquals(5, actual);
    }

    @Test
    public void TestIV(){
        RomanNumeralCalculator rnc = new RomanNumeralCalculator();
        int actual = rnc.Convert("IV");
        assertEquals(4, actual);
    }



}
