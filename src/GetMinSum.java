/**
 * 求最小和
 * 最小和：
 *   在一个数组中，一个数左边比它小的数的总和，叫数的小和，所有数的小和累加起来，叫数组小和
 */
public class GetMinSum {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
         int minSum =process(arr,0, arr.length-1);
        System.out.print(minSum);
    }

    private static int process(int[] arr,int L,int R){
        if(L == R){
            return 0;
        }

        int mid = L + ((R-L)>>1);
      return   process(arr,L,mid)
         +process(arr,mid+1,R)
       + merger(arr,L,mid,R);
    }

    /**
     * 求最小和时采用了归并排序的思想
     * 在归并的过程中：
     * 1.arr[L] < arr[R], 产生小和,拷贝L 位置上的数，L++ 继续对比
     * 2.arr[L] = arr[R], 拷贝R 位置
     * 3，arr[L] > arr[R] ,拷贝 R 位置
     */
    private static int merger(int[] arr,int L, int mid,int R){
        int size = (R - L) + 1;
        int[] help = new int[size];

        int p1 = L;
        int p2 = mid + 1;
        int i = 0;
        int sum =0;
        while (p1 <= mid && p2 <= R) {
            if(arr[p1] < arr[p2]){
                sum +=((R-p2)+1)*arr[p1];
                help[i++] =arr[p1++];
            }else {
                help[i++] = arr[p2++];
            }
        }

        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }

        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (i = 0; i < size; i++) {
            arr[L + i] = help[i];
        }

        return sum;
    }
}
