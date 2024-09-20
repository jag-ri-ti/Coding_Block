package Lecture07;

public class BS_searchSpace {

    static int BSsearch(int dist, int time) {
        int low = 0;
        int ans = 0;
        int high = 200;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            if (helper(mid, time) >= dist) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    static int helper(int time, int speed) {
        int dist = speed * time;
        return dist;
    }

    public static void main(String[] args) {
        int d = 100, t = 2;
        int answer = BSsearch(d, t);
        System.out.println(answer);
    }
}
