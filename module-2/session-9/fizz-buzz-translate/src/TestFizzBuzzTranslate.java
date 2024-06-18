import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzzTranslate {
    FizzBuzzTranslate fizzBuzz = new FizzBuzzTranslate();

    @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz", fizzBuzz.translate(3));
        assertEquals("Fizz", fizzBuzz.translate(6));
    }

    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz", fizzBuzz.translate(5));
        assertEquals("Buzz", fizzBuzz.translate(10));
    }

    @Test
    public void testDivisibleBy3And5() {
        assertEquals("FizzBuzz", fizzBuzz.translate(15));
        assertEquals("FizzBuzz", fizzBuzz.translate(30));
    }

    @Test
    public void testContains3() {
        assertEquals("Fizz", fizzBuzz.translate(13));
        assertEquals("Fizz", fizzBuzz.translate(31));
    }

    @Test
    public void testContains5() {
        assertEquals("Buzz", fizzBuzz.translate(51));
        assertEquals("Buzz", fizzBuzz.translate(53));
    }

    @Test
    public void testNumberToWords() {
        assertEquals("hai", fizzBuzz.translate(2));
        assertEquals("hai sáu", fizzBuzz.translate(26));
        assertEquals("chín chín", fizzBuzz.translate(99));
    }

    @Test
    public void testInvalidNumber() {
        assertThrows(IllegalAccessException.class, () -> fizzBuzz.translate(0));
        assertThrows(IllegalAccessException.class, () -> fizzBuzz.translate(100));
    }
}
