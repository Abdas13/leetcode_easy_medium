package keshif_leetcode_practices;

import java.util.HashMap;
import java.util.Map;

public class OccurancesOfLetters {

    public static void main(String[] args) {
        String s = "aaaabbcccccde";  // output : a4b2c5d1e1
        System.out.println(occurance(s));
    }
    public static String occurance(String s){
        HashMap<Character, Integer> freq = new HashMap<>();

        char[] ch = s.toCharArray();
        for (char c : ch){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        System.out.println(freq);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
}
