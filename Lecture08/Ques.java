package Lecture08;

public class Ques {
    // Q1. Function to reverse a string
    // eg:potato=otatop

    public String reverseStr(String str){
        
        for(int i=str.length();i>=0;i--){
            
            String rev += str.charAt(i);
        }
        return rev;
    }
}
