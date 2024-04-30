package keshif_leetcode_practices;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
    }
    public static boolean isPalindrome(String s){ // 14 ms , 45,02 MB

        String str = s.toLowerCase().trim().replaceAll("[^a-z0-9]","");

        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String s){  // 3 ms, 42,97 MB

        int left = 0;
        int right = s.length()-1;
        while(left<right){
           if (!Character.isLetterOrDigit(s.charAt(left))){
               left++;
           } else if (!Character.isLetterOrDigit(s.charAt(right))) {
               right--;
           }else {
               if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                   return false;
               }else {
                   left++;
                   right--;
               }
           }
        }
        return true;
    }
}

//      a m a n a # p l a n a c a n a l p a n a m a
