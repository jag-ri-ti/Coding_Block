package Lecture08;

public class String1 {
    public static void main(String[] args) {
        // String s0 = "Phone";
        // int[] i0 = { 65, 66, 67 };
        // char[] c0 = { 'a', 'b', 'c' };
        // byte[] b0 = { 65, 70, 71, 72 };

        // for(byte i=0;i<b0.length;i++){
        // b0[i]=i;
        // }
        // part3
        // String s1=new String(b0);
        // for(int i=0;i<s1.length();i++)
        // System.out.println(s1.charAt(i));

        // String s1 = new String(b0,1,2);
        // System.out.println(s1);

        // part 4
        String s1 = "Laptop";
        String s2 = "         laptop  k";
        String s4 = s1.concat(s2);
        String s3 = s1 + s2;

        // System.out.println(s4);
        // System.out.println(s1.contains("ap"));
        // System.out.println(s1.toCharArray());
        System.out.println(s2.trim()); // trim function to remove spaces
    }

}
