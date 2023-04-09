package mycode.massiveCort;

import java.util.*;

public class SingleNumber {
    public static void main(String [] args){
       int [] nums = {2,2,1}; //1
       int [] nums2 = {4,1,2,1,2}; //4
       int [] nums3 = {1,0,1}; //0
        System.out.println( singleNumber(nums2));
    }
        public static int singleNumber(int[] nums) {
            int ans=0; //since XOR with 0 returns same number
            for(int i=0; i<nums.length; i++){
                ans ^= nums[i];  // ans = (ans) XOR (array element at i)
            }
            return ans;
        }

//        public static int singleNumber(int[] nums) {
//        List<Integer> result = new ArrayList<>();
//            for (int i=0; i<nums.length; i++){
//                for (int j=0; j<nums.length; j++){
//                      if (i==j){
//                          if (j==nums.length-1){
//                              result.add(nums[i]);
//                          }
//                          continue;
//                      }
//                      if (nums[i]==nums[j]){
//                          break;
//                      }
//                    if (j==nums.length-1){
//                        result.add(nums[i]);
//                    }
//                }
//            }
//            return result.get(0);
//        }
}