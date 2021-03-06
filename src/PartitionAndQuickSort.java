public class PartitionAndQuickSort {

    public static void main(String[] args) {
//        int[] arr = {5,3,7,2,3,4,1};
//        partition(arr,3);
        int[] arr = {3,5,4,0,4,5,6,8,7,5,9,4,2,1,2,3,5,9,4,5,8,5};
//        partition2(arr,5);
        quickSort(arr,0, arr.length-1);
        for(int a:arr){
            System.out.print(a + " ");
        }
    }

    private static void quickSort(int[] arr,int L ,int R){
        if(L >=R){
            return;
        }
        swap(arr,L+(int)(Math.random()*(R-L+1)),R);
        int[] equalArea =partition2(arr,arr[R]);
        quickSort(arr,L,equalArea[0]-1);
        quickSort(arr,equalArea[1]+1,R);
    }
    /**
     * To divide this arr into three parties ,left part is min than num the middle part is equal the num,
     * and right part is more than num
     * @param arr numbers arr
     * @param num specific num
     */
    private static int[] partition2(int[] arr,int num){
        if(arr == null || arr.length <2){
            return new int[]{-1,-1};
        }

        int leftIndex = -1;
        int rightIndex = arr.length;
        int i =0;
        while (i<rightIndex){
            if(arr[i] == num){
                i++;
            } else if(arr[i] < num){
                ++leftIndex;
                swap(arr,leftIndex,i);
                i++;
            }else if(arr[i] > num){
                swap(arr,i,--rightIndex);
            }
        }
        return new int[]{leftIndex+1,rightIndex-1};
    }

    /**
     * To divide this arr into two parties ,left part is min than num and right part is more than num
     * @param arr numbers arr
     * @param num specific num
     */
    private static void partition(int[] arr,int num){
       if(arr == null || arr.length <2){
           return;
       }

       int index = -1;
       for(int i=0;i< arr.length;i++){
          if(arr[i] <= num){
              index++;
              swap(arr,index,i);
          }
       }
    }

    private static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y] = temp;
    }
}
