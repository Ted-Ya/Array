import java.sql.Array;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 0~0 有序
        // 0~1 有序
        // 0 ~2 有序
        for(int i =0;i < arr.length;i++){
            for (int j = i; j - 1 >= 0 && arr[j - 1] > arr[j]; j--) {
                swap(arr, j - 1, j);
            }
        }
    }

    private static void swap(int[] arr,int indexX, int indexY){
        arr[indexX] = arr[indexX]^arr[indexY];
        arr[indexY] = arr[indexX]^arr[indexY];
        arr[indexX] = arr[indexX]^arr[indexY];
    }
}
