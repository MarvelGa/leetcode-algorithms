package mycode.massiveCort;

import java.util.*;
//41. First Missing Positive
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1}; //2   //-1 1 3 4
        int[] nums2 = {1, 2, 3, 4}; //2   //-1 1 3 4
        int[] nums3 = {1, 0}; //2   //-1 1 3 4
        int[] nums4 = {1, 1}; //2   //-1 1 3 4
        int[] nums5 = {1, 1000}; //2   //-1 1 3 4
        int[] nums6 = {1, 1, 1, 1, 1}; //2   //-1 1 3 4
        int[] nums7 = {1, 2, 0}; //2   //-1 1 3 4

        System.out.println(firstMissingPositive(nums7));
    }

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> uniqValue = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                uniqValue.add(nums[i]);
            }
        }
        nums = uniqValue.stream().mapToInt(Number::intValue).toArray();
        if (nums.length == 0) {
            return 1;
        }
        int max = 0;

        Arrays.sort(nums);
        if (nums.length == 1 && nums[0] == 1) {
            return nums[0] + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                break;
            }
            if (i == nums.length - 1) {
                return 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 1; i <= max; i++) {
            if (nums[i] < 0 || nums[i - 1] < 0) {
                continue;
            }
            if (nums[i] - nums[i - 1] > 1) {
                return nums[i] - 1 > nums[i - 1] + 1 ? nums[i - 1] + 1 : nums[i] - 1;

            }
            if (i == nums.length - 1) {
                return nums[i] + 1;
            }
        }
        return -1;
    }
}
