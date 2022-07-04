import java.util.Arrays;

/**
 * Sort an array ,lets elements of this array in ascending
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

      // 每次一次排序都将最大的数放到最后一个位置
    private static void bubbleSort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }

      for(int i = arr.length-1;i>0;i--){
          for(int j = 0;j<i;j++){
              if(arr[j] > arr[j+1]){
                  swap(arr,j,j+1);
              }
          }
      }
    }

    private static void swap(int[] arr,int indexX, int indexY){
//        int temp = arr[indexX];
//        arr[indexX] = arr[indexY];
//        arr[indexY] = temp;

        arr[indexX] = arr[indexX]^arr[indexY];
        arr[indexY] = arr[indexX]^arr[indexY];
        arr[indexX] = arr[indexX]^arr[indexY];
    }
}
