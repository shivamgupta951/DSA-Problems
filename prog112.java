import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class prog112 {
    public static void main(String args[]) {
        int[] arr = { 5, 3, 5, 2, 3, 4, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // 0 for discarded items.
        ArrayList<Integer> l = new ArrayList<>();
        int processingNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                if (count == 1) {
                    map.remove(arr[i]);
                    // processed
                    l.add(processingNumber);
                } else {
                    // discard item
                    processingNumber++;
                    map.put(arr[i], map.get(arr[i]) - 1);
                }
            }
        }

        System.out.println(Arrays.toString(l.toArray()));
    }
}
