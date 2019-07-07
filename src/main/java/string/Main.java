package string;

public class Main {
    public static void main(String[] args) {

        String s1 = "шалаш";
        String s2 = "карандаш";
        String s3 = "Собка-друг человека";
        palindromeOrNotPalindrome(s1, s1);
        palindromeOrNotPalindrome(s2, s2);
        

    }

    public static void palindromeOrNotPalindrome(String testString, String originalString) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(testString);
        sb1.reverse();
        testString = sb1.toString();
        System.out.println(originalString + " -- это палиндром ? : " + testString.equals(originalString));

    }
}
