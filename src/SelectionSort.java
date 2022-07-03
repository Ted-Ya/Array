import java.util.Arrays;

/**
 * Sort an array ,lets elements of this array in ascending
 */
public class SelectionSort {

    public static void main(String[] args) {
       int[] arr ={5,4,3,2,1};
       selectionSort(arr);
       System.out.println(Arrays.toString(arr));
    }

    /**
     * every traversal of this arr ,we will find the minor number,and put it in the right position
     * @param arr need to be sorted
     */
    private static void selectionSort(int[] arr){
      if(arr == null || arr.length <2){
          return;
      }

      //first time arrange : 0~n-1
      //sec time arrange : 1~ n-1
      for(int i=0;i< arr.length;i++){

          // the index of the minor value
          int minIndex = i;
            for(int j= i+1;j< arr.length;j++){ //find the minor value index
                minIndex = arr[j] < arr[minIndex] ? j:minIndex;
            }
            swap(arr,i,minIndex);
//          for(int j =i;j-1>=0&&j<arr.length;j--){
//              if(arr[j-1]>arr[j]){
//                  swap(arr,j-1,j);
//              }
//          }
      }
    }

    private static void swap(int[] arr,int indexX, int indexY){
        int temp = arr[indexX];
        arr[indexX] = arr[indexY];
        arr[indexY] = temp;
    }
}
