package keshif_leetcode_practices;

public class ExcelColumnCharToNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle){

        char[] letters = columnTitle.toCharArray();  // [A, B, E]

        int columnNum = 0;
        int left = 0;
        int right = letters.length-1;
        while (right>=0){
            columnNum += Math.pow(26, left) * ((letters[right] - 'A') +1);
            right--;
            left++;
        }
        return columnNum;
    }
}
