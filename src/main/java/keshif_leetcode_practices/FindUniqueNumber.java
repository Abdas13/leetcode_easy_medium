package keshif_leetcode_practices;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumber {
    public static void main(String[] args) {

        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        System.out.println(freq);
        for(Map.Entry<Integer, Integer> ikili : freq.entrySet()){
            if (ikili.getValue() == 1){
                return ikili.getKey();
            }
        }
        return -1;
    }
    public static int singleNumber2(int[] nums){
        return -1;
    }

}
