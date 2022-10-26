import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {
    BalancedBrackets brackets = new BalancedBrackets();

    String s = "()"; // true
    String s1 = "()))"; // false
    String s2 = "(())";  // true
    String s3 = "((((("; // false

    String s4 = "({}"; // false
    String s5 = "({})";  // true
    String s6 = "<({})"; // false
    String s7 = "<({})>";  // true
    String s8 = "[<({})>"; // false
    String s9 = "[<({})>]";  // true

    String s10 = "{{]]";  // false
    String s11 = "}{";  // false
    String s12 = "(]";   // false
    String s13 = "[(])";   // false

    @Test
    public void testBalancedBrackets_SingleRegularBalancedParentheses() {

        Assert.assertTrue(brackets.balancedBrackets(s));
    }

    @Test
    public void testBalancedBrackets_DoubleRegularBalancedParentheses() {

        Assert.assertTrue(brackets.balancedBrackets(s2));
    }

    @Test
    public void testBalancedBrackets_BalancedCurlyAndRegularBrackets() {

        Assert.assertTrue(brackets.balancedBrackets(s5));
    }

    @Test
    public void testBalancedBrackets_BalancedAllTypesOfBrackets() {

        Assert.assertTrue(brackets.balancedBrackets(s9));
    }

    @Test
    public void testBalancedBrackets_TooManyClosedParentheses() {

        Assert.assertFalse(brackets.balancedBrackets(s1));
    }

    @Test
    public void testBalancedBrackets_TooManyOpenedParentheses() {

        Assert.assertFalse(brackets.balancedBrackets(s3));
    }

    @Test
    public void testBalancedBrackets_OneTypeOpenedOtherTypeClosed() {

        Assert.assertFalse(brackets.balancedBrackets(s10));
    }

    @Test
    public void testBalancedBrackets_BalancedAmountButClosedIncorrectly() {

        Assert.assertFalse(brackets.balancedBrackets(s13));
    }

    @Test
    public void testBalancedBrackets_StartFromClosedBracket() {

        Assert.assertFalse(brackets.balancedBrackets(s11));
    }

    @Test
    public void testBalancedBrackets_EmptyString() {

        Assert.assertTrue(brackets.balancedBrackets(""));
    }
}
