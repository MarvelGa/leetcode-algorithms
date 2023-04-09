package mycode.massiveCort;

import java.util.Arrays;
import java.util.stream.IntStream;
// 268. Missing Number
public class MissingNumber {
    public static void main(String[] args) {
       int [] nums = {3,0,1};
       int [] nums2 = {0,1};
       int [] nums3 = {1,2};
        System.out.println(missingNumber2(nums3));
    }

    public static int missingNumber2(int[] nums) {
        nums = Arrays.stream(nums)
                .sorted()
                .toArray();

        for (int i=1; i< nums.length; i++){
            if (nums[0]!=0){
                return 0;
            }

            if (nums[i]-nums[i-1]!=1){
                return nums[i]-1;
            }
            if (i==nums.length-1){
                return nums[nums.length-1]+1;
            }
        }
        return nums.length==1 && nums[nums.length-1]==0 ?nums[nums.length-1]+1:0 ;
    }
    public static int missingNumber(int[] nums) {
        int result =0;
        int max =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }

        int [] mass2 = IntStream
                .range(0, max+1)
                .toArray();

        if (mass2.length==nums.length){
            nums =Arrays.stream(nums)
                    .sorted()
                    .toArray();
            return nums[nums.length-1]+1;
        }

        for (int i = 0; i < mass2.length; i++) {
            if (i==mass2.length-1){
                result ^=mass2[i];
            }else{
                result ^=nums[i]^mass2[i];
            }

        }

    return result;
    }

}
