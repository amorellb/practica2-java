package practica2Java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ScanInputTest {

    @Test
    public void isRightOptionTrue() {
        assertTrue(ScanInput.isRightOption("a"));
    }

    @Test
    public void isRightOptionFalse() {
        assertFalse(ScanInput.isRightOption("z"));
    }

    @Test
    public void isNumberTrue() {
        assertTrue(ScanInput.isNumber("1"));
    }

    @Test
    public void isNumberFalse() {
        assertFalse(ScanInput.isNumber("a"));
    }

    @Test
    public void calculateAvgNormal() {
        assertEquals(2, ScanInput.calculateAvg(Arrays.asList(2, 2, 2, 2, 2)));
    }

    @Test
    public void calculateAvgZero() {
        assertEquals(0, ScanInput.calculateAvg(Arrays.asList(0, 0, 0, 0, 0)));
    }

    @Test
    public void isRightVowelTrue() {
        assertTrue(ScanInput.isRightVowel("a"));
    }

    @Test
    public void isRightVowelFalse() {
        assertFalse(ScanInput.isRightVowel("z"));
    }
}
