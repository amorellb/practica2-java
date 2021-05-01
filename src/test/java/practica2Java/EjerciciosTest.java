package practica2Java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EjerciciosTest {

    @Test
    public void countCharsTest() {
        Assertions.assertEquals(10, Ejercicios.countChars("Hello world"));
    }

    @Test
    public void printReverseSentenceTest() {
        Assertions.assertEquals("dlrow olleH", Ejercicios.printReverseSentence("Hello world"));
    }

    @Test
    public void printSentenceWithoutSpacesTest() {
        Assertions.assertEquals("Helloworld", Ejercicios.printSentenceWithoutSpaces("Hello world"));
    }

    @Test
    public void concatTwoStringsTest() {
        Assertions.assertEquals("HelloWorld", Ejercicios.concatTwoStrings("Hello", "World"));
    }
}
