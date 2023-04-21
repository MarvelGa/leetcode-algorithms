package mycode.massiveCort;

import java.util.HashMap;
import java.util.Map;

//169. Majority Element
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numberToAppearance = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberToAppearance.containsKey(nums[i])) {
                Integer currentAppearance = numberToAppearance.get(nums[i]);
                numberToAppearance.put(nums[i], currentAppearance + 1);
            } else {
                numberToAppearance.put(nums[i], 1);
            }

        }
        int elemWithMaxValue = -1;
        int maxValue = -1;
        for (Map.Entry<Integer, Integer> elem : numberToAppearance.entrySet()) {
            if (elem.getValue() > maxValue) {
                maxValue = elem.getValue();
                elemWithMaxValue = elem.getKey();
            }
        }
        return elemWithMaxValue;
    }
}
