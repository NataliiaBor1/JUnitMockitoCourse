import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {

    @Test
    public void testMissingNumber_EightIsMissing () {
        MissingNumber missingNumber = new MissingNumber();

        Assert.assertEquals(8, missingNumber.findMissingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10));
    }

    @Test
    public void testMissingNumber_MaxIsMissing () {
        MissingNumber missingNumber = new MissingNumber();

        Assert.assertEquals(10, missingNumber.findMissingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 8, 9}, 10));
    }

    @Test
    public void testMissingNumber_NoneIsMissing () {
        MissingNumber missingNumber = new MissingNumber();

        Assert.assertEquals(0, missingNumber.findMissingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 8, 9, 10}, 10));
    }


}
