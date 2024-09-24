package Lecture08;

public class Learn_String {

    // public void Srings(){
    // if (s1.length<s2.length){
    // System.out.println();
    // }
    // }

    static boolean Palindrome(String str) {
        str = "Radar";
        String reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public String CompareStr(String s1, String s2) {
        if (s1.length() < s2.length()) {
            System.out.println("s2 is grater");
        }
        if (s1.length() > s2.length()) {
            System.out.println("s1 is grater");
        }
        if (s1 == s2) {
            System.out.println("s1 and s2 are same");
        }

    }

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        (Palindrome(s1));

        // length()
        // charAt(index)
        // s1.substring(index)
        // s1.compareTo()
        // s1.substring

    }
}
