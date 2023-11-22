import org.example.Level;
import org.example.Utilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 711, -5, -51})
    public void testNumberIsOddTrue(int number) {
        var expected = true;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -8, -512})
    public void testNumberIsOddFalse(int number) {
        var expected = false;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   ", " ", "     "})
    @NullAndEmptySource
    public void testStringIsBlankTrue(String input) {
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "Geetika", "aws", "java"})
    public void testStringIsBlankFalse(String input){
        var expected = false;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullSource
    @NullAndEmptySource
    public void testStringIsBlankNull(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,15,25,30, -1})
    public void testGetNoiseLevelLow(int decibel){
        var expected = Level.Low;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);

    }
    @ParameterizedTest
    @ValueSource(ints = {70, 134, 132, 1337, 90})
    public void testGetNoiseLevelHigh(int decibel){
        var expected = Level.High;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);

    }
    @ParameterizedTest
    @ValueSource(ints = {45, 35, 48,65})
    public void testGetNoiseLevelMedium(int decibel){
        var expected = Level.Medium;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvSource(value = {"tEst : test", "TEST : test", "test:test", "Test :test"}, delimiter = ':')
    public void testMakeStringLowercase(String input, String expected){
        var actual = Utilities.makeStringLowercase(input);

        assertEquals(expected, actual);
    }

}
