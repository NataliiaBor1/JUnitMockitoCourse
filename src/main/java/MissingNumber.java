import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {

    public int findMissingNumber (int[] n, int max) { // O(n)
        int maxSum = (1 + max) * max/ 2;
        int realSum = 0;
        for (int i = 0; i < n.length; i++) {
            realSum += n[i];
        }
        if (maxSum - realSum == max) {
            return max;
        }
        return maxSum - realSum;
    }

    public static int missingNumber(int[] nums, int maxNum) {  // something is wrong in this solution

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int i = 1; i <= maxNum; i += 1) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static int missingNumberSort(int[] nums, int maxNum) {
        Arrays.sort(nums);

        for (int i = 1; i < maxNum; i += 1) {
            if (i != nums[i - 1]) {
                return i;
            }
        }
        // If none is missing
        if (nums.length == maxNum && nums[maxNum - 1] == maxNum) {
            return 0;
        }

        return maxNum;
    }

    public static int missingNumberSum(int[] nums, int maxNum) {  // wrong solution
        // Alternate solution: int sum = (nums.length + 1)*(nums.length) / 2
        int expectedSum = 0;
        for (int i = 1; i <= maxNum; i += 1) {
            expectedSum += i;
        }

        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;
    }


}
