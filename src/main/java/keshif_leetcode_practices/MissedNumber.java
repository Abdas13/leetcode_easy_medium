package keshif_leetcode_practices;

import java.util.Arrays;
import java.util.HashSet;

public class MissedNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missedNumber(nums));

    }
    public static int missedNumber(int[] nums){ // 6 ms, 45.11 MB

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i ){
                return i;
            }
        }
        return nums.length;
    }
    public static int missedNumber2(int[] nums){ // 5 ms, 45.11 MB
        HashSet<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!numSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static int missedNumber3(int[] nums){ // 0 ms, 45.74 MB

        int beklenenToplam = nums.length * (nums.length + 1) / 2;
        int gerceklesenToplam = 0;
        for (int i = 0; i < nums.length; i++) {
            gerceklesenToplam += nums[i];
        }
        return beklenenToplam - gerceklesenToplam;
    }
}
//         [9,6,4,2,3,5,7,0,1]  toplam 9 * 10 / 2 = 45

  //   1+2+3+4 = (4*5)/2