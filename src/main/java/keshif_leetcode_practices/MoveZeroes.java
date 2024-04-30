package keshif_leetcode_practices;
import java.util.Arrays;

public class MoveZeroes {
    /*
    Given an integer array nums, move all 0's to the end of it while
    maintaining the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.
     */
    public static void main(String[] args) {
        int[] nums = {1,2,0,0,3,0,5};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] nums){

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] !=0 ){
                nums[left] = nums[right];
                left++;
            }
        }
        for (int i = left; i < nums.length ; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
