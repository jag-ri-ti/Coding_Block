package Lecture09;

public class Searcharr {

    public static int[] linerSearch(int[][] arr, int element) {
        int[] ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr=;

        int num =linerSearch(arr, 1);
    }
}
