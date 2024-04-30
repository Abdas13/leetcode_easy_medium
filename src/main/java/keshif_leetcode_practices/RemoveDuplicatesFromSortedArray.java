package keshif_leetcode_practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));
    }
    public static int removeDuplicate(int[] nums){

        int left = 0;
        for (int right = 1; right < nums.length ; right++) {
            if(nums[right] != nums[left]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;
    }
    public static int removeDuplicates(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]){
                list.add(nums[i-1]);
            }
        }
        list.add(nums[nums.length-1]);
        return list.size();
    }
    public static int removeDupl(int[] nums){

        Set<Integer> hs = new HashSet<>();
        for (Integer num: nums){
            hs.add(num);
        }
        System.out.println(hs);
        return hs.size();
    }
}
