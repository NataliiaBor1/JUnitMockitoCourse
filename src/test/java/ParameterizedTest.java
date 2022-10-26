import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private String input;
    private boolean expectedOutput;
    BalancedBrackets bb = new BalancedBrackets();

    public ParameterizedTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {

        String balancedParentheses = "()"; // true
        String doubleBalancedPar = "(())";  // true
        String twoTypesOfBrackets = "({})";  // true
        String balancedAllTypesOfBrackets = "[<({})>]";  // true
        String emptyString = "";   // true
        String tooManyClosedBrackets = "()))"; // false
        String tooManyOpenedBrackets = "((((("; // false
        String oneTypeOpenedOtherTypeClosed = "{{]]";  // false
        String balancedAmountButClosedIncorrectly = "[(])";   // false
        String startFromClosedBracket = "}{";  // false

        Object[][] expectedOutputs = {
                {balancedParentheses, true},
                {doubleBalancedPar, true},
                {twoTypesOfBrackets, true},
                {balancedAllTypesOfBrackets, true},
                {emptyString, true},
                {tooManyClosedBrackets, false},
                {tooManyOpenedBrackets, false},
                {oneTypeOpenedOtherTypeClosed, false},
                {balancedAmountButClosedIncorrectly, false},
                {startFromClosedBracket, false}
        };

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testBalancedBrackets() {
        Assert.assertEquals(expectedOutput, bb.balancedBrackets(input));
    }
}

