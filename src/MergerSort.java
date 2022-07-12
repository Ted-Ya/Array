/**
 * There are ways to make an arr to be ordered
 * 1.let its left part to ordered, let other part to be ordered
 * 2.merger those two ordered parties to be an ordered arr
 */
public class MergerSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 3, 6, 5};
        int r = arr.length - 1;
//        process(arr, 0, r);
        mergerSort2(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    /**
     * using recursion way
     *
     * @param arr an array waiting to be ordered
     * @param L   left index
     * @param R   Right index
     */
    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merger(arr, L, mid, R);
    }


    public static void merger(int[] arr, int L, int mid, int R) {
        int size = (R - L) + 1;
        int[] help = new int[size];

        int p1 = L;
        int p2 = mid + 1;
        int i = 0;
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
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

    }


    /**
     * using non recursion method to implement merger sort
     */
    public static void mergerSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        int mergerSize = 1;
        while (mergerSize < N) {
            int L = 0;
             while (L <N){
                 int M = L + mergerSize -1;
                 if(M>=N){
                     break;
                 }
                 int R =Math.min(M+mergerSize,N-1);
                 merger(arr,L,M,R);
                 L = R +1;
             }

             if(mergerSize/2 >N){
                 break;
             }
            mergerSize <<= 1;
        }

    }
}
