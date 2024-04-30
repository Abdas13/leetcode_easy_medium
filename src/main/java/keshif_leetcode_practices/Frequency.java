package keshif_leetcode_practices;

import java.util.HashMap;

public class Frequency {
    // We tried to find the frequency of each string split by ","

    public static void main(String[] args) {
        String status = "PASS,FAIL,FAIL,FAIL,PASS,PASS,PASS,PASS,FAIL,PASS";

        String[] strs = status.split(",");
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String str : strs){
            frequency.put(str, frequency.getOrDefault(str, 0) + 1 );
        }
        System.out.println(frequency);
    }
}
