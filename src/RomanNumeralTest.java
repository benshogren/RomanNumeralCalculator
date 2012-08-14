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

    @Test
    public void TestXIV(){
        RomanNumeralCalculator rnc = new RomanNumeralCalculator();
        int actual = rnc.Convert("XIV");
        assertEquals(14, actual);
    }

    @Test
    public void TestIXX(){
        RomanNumeralCalculator rnc = new RomanNumeralCalculator();
        int actual = rnc.Convert("IXX");
        assertEquals(19, actual);
    }

    @Test
    public void TestMCL(){
        RomanNumeralCalculator rnc = new RomanNumeralCalculator();
        int actual = rnc.Convert("MCIL");
        assertEquals(1149, actual);
    }

}
