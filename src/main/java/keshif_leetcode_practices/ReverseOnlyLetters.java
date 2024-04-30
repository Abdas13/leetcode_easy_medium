package keshif_leetcode_practices;

public class ReverseOnlyLetters {
    public static void main(String[] args) {

        String s = "Test1ng-Leet=code-Q!";
//      output :   "Qedo1ct-eeLg=ntse-T!

        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s){

        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;

        while (left<right){
            if (Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(ch[left])) {
                left++;
            } else if (!Character.isLetter(ch[right])) {
                right--;
            }
        }
//        return new String(ch);
        return String.valueOf(ch);
    }
}
