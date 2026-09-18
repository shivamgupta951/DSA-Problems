import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Pair {
    int value;
    int index;

    Pair(int v, int i) {
        this.value = v;
        this.index = i;
    }
}

public class prog111 {
    public static void main(String args[]) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        int[] ans = new int[arr.length];
        Stack<Pair> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek().value <= arr[i]) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? i + 1 : i - s.peek().index;
            s.add(new Pair(arr[i], i));
        }
        System.out.println(Arrays.toString(ans));
    }
}
