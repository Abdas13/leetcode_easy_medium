package keshif_leetcode_practices;

import java.util.Arrays;

public class FindLengthOfLastWord {
    public static void main(String[] args) {
        String s = "aaa Hello World";
//        System.out.println(lengthOfLastWord(s));
//        System.out.println(lengthOfLastWord2(s));
//        System.out.println(lengthOfLastWord3(s));
        System.out.println(lengthOfLastWord4(s));
    }
    public static int lengthOfLastWord(String s) { // 0 ms , 41.89
        String[] str = s.trim().split(" ");

        return str[str.length-1].length();
    }
    public static int lengthOfLastWord2(String s){
        int lastSpace = s.trim().lastIndexOf(' ');

        return s.length()-lastSpace-1;
    }
    public static int lengthOfLastWord3(String str){ // 0 ms , 41.61
        String s = str.trim();
        int right = s.length()-1;
        int left = right;
        while (left>=0 && s.charAt(left)!= ' '){
            left--;
        }
        return right - left;
    }
    public static int lengthOfLastWord4(String str){  // 0 ms, 41.91 MB
        int lengthOfLastWord = Arrays.stream(str.trim().split(" "))
                .mapToInt(String::length)
                .reduce((first, second)-> second)
                .orElse(0);
        return lengthOfLastWord;
    }
}

//     "aaa Hello World "