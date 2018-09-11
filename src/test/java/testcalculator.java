import org.junit.Assert;
import org.junit.Test;

public class testcalculator {
@Test
    public void test1plus1 ()
    {
        // Arranger = Organiser
        int arg1 = 1;
        int arg2 = 5;
        int expectedResult = 6;

        // Act = Action
        int returnedResult = CALCULATOR.add( arg1, arg2);

        // Assert = Verifier
        Assert.assertEquals(expectedResult, returnedResult);

    }



    @Test (expected = IndexOutOfBoundsException.class)
    public void testMax()
    {
        // Arranger = Organiser
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        // Act = Action
        int returnedResult = CALCULATOR.add( arg1, arg2);
    }
}
