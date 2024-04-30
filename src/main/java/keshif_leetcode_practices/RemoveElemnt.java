package keshif_leetcode_practices;

public class RemoveElemnt {
    /* Given an integer array nums and an integer val, remove all
    occurrences of val in nums in-place. The order of the elements
    may be changed. Then return the number of elements in nums
    which are not equal to val.
     */
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,3,4};
        int val = 3;
        System.out.println(removeElement(nums,val));
//        System.out.println(removeElemt(nums,val));
    }
    public static int removeElement(int[] nums, int val){

        int left =0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
    public static int removeElemt(int[] nums, int val){
        int left = 0;
        int right = 0;
         while(right< nums.length){
             if(nums[right]==val){
                 right++;
             }else{
                 nums[left]=nums[right];
                 right++;
                 left++;
             }
         }
         return left;
    }
}
