import java.util.ArrayList;

 class MoveAllZeros {
    void pushZerosToEnd(int[] arr) {
        // code here
        ArrayList<Integer> te = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                te.add(arr[i]);
        }
        int rem = te.size();
        for (int i = 0; i < rem; i++) {
            arr[i] = te.get(i);
        }
        for (int i = rem; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
 }
 public class MoveAllZerosEnd{
    public static void main(String[] args) {
        int[] arr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };

        MoveAllZeros mover = new MoveAllZeros();
        mover.pushZerosToEnd(arr);

        // Print the resulting array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
