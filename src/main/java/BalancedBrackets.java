import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

    public boolean balancedBrackets(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');
        charMap.put('>', '<');

        for (char x : s.toCharArray()) {

            switch (x) {
                case ('('):
                case ('['):
                case ('{'):
                case ('<'):
                    stack.push(x);
                    break;
                // "[(])" --->   [( --->  ( != [ ---> false
                // "[()]" --->  [( ---> ( != ( ----> [ != [
                case (')'):
                case (']'):
                case ('}'):
                case ('>'):
                    if (stack.isEmpty() || stack.pop().charValue() != charMap.get(x)) {
                        return false;
                    }
                    break;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
