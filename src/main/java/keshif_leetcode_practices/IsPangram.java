package keshif_leetcode_practices;

import java.util.HashSet;
import java.util.Set;

public class IsPangram {
    public static void main(String[] args) {

        String sentence = "the,quickbrownfoxjumpsoverthelazydog.";
        String s = "leetcode";
        System.out.println(checkIfPangram1(sentence));
        System.out.println(checkIfPangram2(sentence));
        System.out.println(checkIfPangram3(sentence));
        System.out.println(checkIfPangram4(sentence));
    }
    public static boolean checkIfPangram1(String sentence){ // 3ms, 42.16 MB

        Set<Character> chars = new HashSet<>();
        for (char c : sentence.toCharArray()){
            if (Character.isLetter(c)) {
                chars.add(c);
            }
        }
        if (chars.size()==26){
            return true;
        }
        return false;
    }
    public static boolean checkIfPangram2(String sentence){ // 0 ms, 41.52 MB
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i)== -1){
                return false;
            }
        }
        return true;
    }
    public static boolean checkIfPangram3(String sentence){  // 0 ms, 41.42 MB
        char curr =  'a';
        while(curr<'z'+1){
            if(sentence.indexOf(curr)==-1) {
                return false;
            }else {
                curr++;
            }
        }
        return true;
    }
    public static boolean checkIfPangram4(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.contains(Character.toString(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome5(String sentence){  // 1 ms, 41.34 MB
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()){
            seen[c - 'a'] = true;
        }
        for (boolean ans : seen){
            if (!ans)
                return false;
        }
        return true;
    }
}
