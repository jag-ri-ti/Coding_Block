package Lecture08;

//1839
public class GoodString {
    public int goodString(String str){
        int maxlength=0,currlength=0;
        String[] arr={"a","e","i","o","u"};
        for(int i=0,i<=n,i++)
    }

    public int longestgoodSubstring(String word) {
        int cnt = 1;
        int len = 1;
        int max_length = 0;

        int n = word.length();

        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                len++;
            } else if (word.charAt(i - 1) < word.charAt(i)) {
                cnt++;
                len++;
            } else {
                len = 1;
                cnt = 1;
            }

            if (cnt == 5) {
                max_length = Math.max(max_length, len);
            }
        }
        return max_length;
    }

}

// 1839
