package mycode.massiveCort;

import java.util.Arrays;

// 645. Set Mismatch
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 2, 7, 6, 4, 8, 9}; //1223456789
        int[] nums2 = {1, 1}; //12
        int[] nums3 = {2, 2}; //21
        int[] nums4 = {3, 2, 2}; //21

        System.out.println(Arrays.toString(findErrorNums(nums4)));
    }

    public static int[] findErrorNums(int[] nums) {
        int dublicate = 0;
        int missedNumber = 0;
        nums = Arrays.stream(nums)
                .sorted()
                .toArray();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 0) {
                dublicate = nums[i];
                if (nums[0] != 1) {
                    missedNumber = 1;
                    return new int[]{dublicate, missedNumber};
                }
                if (i == nums.length - 1 && missedNumber == 0) {
                    missedNumber = nums[nums.length - 1] + 1;
                    return new int[]{dublicate, missedNumber};
                }
                continue;
            }
            if (nums[i] - nums[i - 1] != 1) {
                if (nums[0] == 1) {
                    missedNumber = nums[i] - 1 == 0 ? nums[i] + 1 : nums[i] - 1;
                } else {
                    missedNumber = 1;
                }
            }
            if (i == nums.length - 1 && missedNumber == 0) {
                missedNumber = nums[nums.length - 1] + 1;
            }

        }
        return new int[]{dublicate, missedNumber};
    }
}
