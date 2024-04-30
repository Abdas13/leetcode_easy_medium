package keshif_leetcode_practices;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15, 17};
        int target = 22;

//        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumByTwoPointer(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static int[] twoSumByTwoPointer(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[left] + nums[right]==target){
                return new int[]{left, right};
            }
            if (nums[left] + nums[right] < target){
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            }
        }
        return new int[] {};
    }
    public static int[] twoSumByHashMap(int[] nums, int target){

        int[] answer = new int[2];
        HashMap<Integer, Integer> pairs = new HashMap<>();

        if(nums.length < 1000 || nums.length > 9999) {
            for (int i = 0; i < nums.length; i++) {
                int fark = target - nums[i];
                if (pairs.containsKey(fark)) {
                    answer[0] = i;
                    answer[1] = pairs.get(fark);
                    break;
                } else {
                    pairs.put(nums[i], i);
                }
            }
        }
        return answer;
    }
    //  2, 7, 11, 15, 17
}

//   a + b = c  => a = c - b