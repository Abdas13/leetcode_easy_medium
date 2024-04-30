package keshif_leetcode_practices;

public class ReverseOfArray {
    /*
    Generate a method to find the reverse of a string, an int, an array
     */
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        String s = "kesifplus";
        int num = 1234;

        System.out.println(reverseOfCharArray(ch));
        System.out.println(reverseOfCharArray(s.toCharArray()));
        System.out.println(reverseOfCharArray(Integer.toString(num).toCharArray()));
    }
    public static char[] reverseOfCharArray(char[] ch){

        int left = 0;
        int right = ch.length-1;
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return ch;
    }
}
