package basic;

public class Practice {
    // 1〜Nの合計値を求める
    public static int Sum() {
        int sum = 0;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int Fibonacci() {
        int F0 = 0, F1 = 1, Fn = 0;
        for (int i = 0; i < 10; i++) {
            Fn = F0 + F1;
            // System.out.println(Fn);
            F0 = F1;
            F1 = Fn;
        }
        return Fn;
    }

    public static int ValidElementNum() {
        int[] myList = { 1, 2, 3, 4, -1 };
        int i = 0;
        while (true) {
            if (myList[i] == -1)
                break;
            i++;
        }
        return i;
    }

    public static int MaxValue() {
        int max = -1;
        int[] myList = { 1, 2, 3, 4 };
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;
    }
}
