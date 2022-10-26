import org.junit.Assert;
import org.junit.Test;

public class TruncateAInFirst2PositionsTest {

    @Test
    public void test() {
        TruncateAInFirst2Positions truncate = new TruncateAInFirst2Positions();
//        String actual = truncate.truncateAInFirst2Positions("AACD");
//        String expected = "CD";
        Assert.assertEquals("CD", truncate.truncateAInFirst2Positions("AACD"));
        Assert.assertEquals("CD", truncate.truncateAInFirst2Positions("ACD"));
        //expected, actual

    }


}
