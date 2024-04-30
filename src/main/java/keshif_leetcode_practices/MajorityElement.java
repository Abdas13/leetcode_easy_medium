package keshif_leetcode_practices;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /* Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
Input: nums = [2,2,1,1,1,2,2]
Output: 2
     */
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums){

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet() ){
            if (entry.getValue() > nums.length / 2 ){
                return entry.getKey();
            }
        }
        return -1;
    }
}
