/* Reverse an Array */

public class prog2 {
    public static void reverse(int[] array) {
        int j = array.length - 1;
        for (int i = 0; i < j; j--, i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return;
    }

    public static void main(String args[]) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        reverse(array);
        reverse(array2);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : array2) {
            System.out.print(ele + " ");
        }
    }
}
