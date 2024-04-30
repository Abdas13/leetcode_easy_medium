package keshif_leetcode_practices;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class IsAnagram {
    /* Given two strings s and t, return true if t is an anagram of s,
    and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of
    a different word or phrase, typically using all the original letters
    exactly once.
     */
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram3(s,t));
    }
    public static boolean isAnagram1(String s, String t){  // 20 ms, 44,63 MB
        Map<Character, Integer> freqS = new TreeMap<>();
        Map<Character, Integer> freqT = new TreeMap<>();

        for (char c : s.toCharArray()){
            freqS.put(c, freqS.getOrDefault(c, 0)+1); // (a,3),(g,1),(m,1),(n,1),(r,1)
        }
        for (char c : t.toCharArray()){
            freqT.put(c, freqT.getOrDefault(c, 0)+1); // (a,3),(g,1),(m,1),(n,1),(r,1)
        }
        return freqS.equals(freqT);
    }
    public static boolean isAnagram2(String s, String t){ // 4 ms, 44,48 MB
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
    public static boolean isAnagram3(String s, String t){ // 2 ms, 43.19 MB

        int[] chars = new int[26]; // [0,0,0,0,0,0, ...]

        for (char c : s.toCharArray()){
            chars[c - 'a']++;
        }
        for (char c : t.toCharArray()){
            chars[c - 'a']--;
        }
        for (int value : chars){
            if (value != 0){
                return false;
            }
        }
        return true;
    }
}
