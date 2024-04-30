package keshif_leetcode_practices;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FindLargestUniqueNumber {

    public static void main(String[] args) {
        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        System.out.println(largestUniqueNumber(nums));

    }

    public static int largestUniqueNumber(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
//        System.out.println(freq);
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (!freq.containsValue(1)) {
                return -1;
            }
            if (entry.getValue() == 1) {
                answer = Math.max(answer, entry.getKey());
            }
        }
        return answer;
    }

    public static int largestUniqueNumber2(int[] nums) {
        TreeSet<Integer> once = new TreeSet<>();

        for (int n : nums) {
            if (!once.contains(n))
                once.add(n);
            else
                once.remove(n);
        }
        if (once.iterator().hasNext())
            once.iterator().next();

        return once.last();
    }
}