import java.util.Stack;
import java.util.Arrays;

class Pair {
    int value;
    int index;

    Pair(int v, int i) {
        this.value = v;
        this.index = i;
    }
}

public class prog113 {
    public static void main(String args[]) {
        int arr[] = { 100, 80, 120, 70, 60, 150, 130 };
        Stack<Pair> s = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek().value <= arr[i]) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? i + 1 : i - s.peek().index;
            s.push(new Pair(arr[i], i));
        }
        System.out.println(Arrays.toString(ans));
    }
}
