import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int n = 483;
//        int count = 0;
//        while (n!=0){
//
//            System.out.println("Count 11:==>"+ (n /=10));
//            count++;
//        }
//        System.out.println("Count:==>"+count);
        int[] arr = {1,0,2,3,0,4,5,0};
        //bubbleSort(arr);
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
        int a = 5;
        int b = 3;
        int c = a-- - --a + ++b * b-- - (a += b++);
        int d =  a+b+c;
        System.out.println(c);
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped=false;
            for (int j = 0; j < (arr.length-i-1); j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }

    public  static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
                int temp = arr[i];
                arr[i]= arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }
}