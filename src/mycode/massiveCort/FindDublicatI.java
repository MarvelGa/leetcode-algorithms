package mycode.massiveCort;

import java.util.HashSet;
import java.util.Set;

// 287. Find the Duplicate Number
public class FindDublicatI {
    public static void main(String[] args) {
       int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate3(nums));
    }

    //my soulution
    public static int findDuplicate2(int[] nums) {
        Set<Integer> duplicate = new HashSet<>();
        for (int elem: nums){
            if (duplicate.contains(elem)) {
                return elem;
            }else{
                duplicate.add(elem);
            }
        }
        return -1;
    }

    //best solution

    public static int findDuplicate3(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0];
    }
    public static int findDuplicate(int[] nums) {

        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];

        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}