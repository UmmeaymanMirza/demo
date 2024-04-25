import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        int i = 0;

        while (i < length - 1) {
            if (arr[i] == 0) {
                shiftRight(arr, i + 1);
                arr[i + 1] = 0;
                i += 2;
            } else {
                i++;
            }
        }
    }

    private static void shiftRight(int[] arr, int startIndex) {
        for (int i = arr.length - 1; i > startIndex; i--) {
            System.out.println("arr[i]:-->"+arr[i]);
            System.out.println("arr[i-1]:-->"+arr[i-1]);
            arr[i] = arr[i - 1];
        }
    }

    public static void main(String[] args) {
       // Output: [1, 0, 0, 2, 3, 0, 0, 4]

        int[] arr2 = {1,0, 2, 3};
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2)); // Output: [1, 2, 3]
    }
}
