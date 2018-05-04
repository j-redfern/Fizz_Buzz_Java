import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void ValidatingInputIsNumeric(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        boolean validate = fizzBuzz.ValidateDataType("3");
        assertEquals(true, validate);

        boolean InvalidValidation = fizzBuzz.ValidateDataType("input");
        assertEquals(false, InvalidValidation);
    }

    @Test
    void PrintNumbers(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<Integer> list = fizzBuzz.PrintNumbers(5);
        assertEquals(new Integer (1), list.get(0));
        assertEquals(new Integer (2), list.get(1));
        assertEquals(new Integer (3), list.get(2));
        assertEquals(new Integer (4), list.get(3));
        assertEquals(new Integer (5), list.get(4));

    }


}