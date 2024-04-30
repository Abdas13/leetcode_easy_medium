package keshif_leetcode_practices;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
//        System.out.println(singleNumber2(nums));
    }
    public static int singleNumber(int[] nums){

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }
        System.out.println(freq);
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static int singleNumber2(int[] nums){

        HashSet<Integer> birDefa = new HashSet<>();  //  [4,  ]

        for (int n : nums){
            if(!birDefa.contains(n)){
                birDefa.add(n);
            }else {
                birDefa.remove(n);
            }
        }
        return birDefa.iterator().next();
    }

}
