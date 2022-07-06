// 使用递归的方式找出数组中的最大值
public class GetMax {

    public static void main(String[] args) {
        int[] arr = {6,7,3,4,7,8,12};
        int maxNum = getMax(arr,0,arr.length-1);
        System.out.print(maxNum);
    }

   private static int getMax(int[] arr,int L ,int R){
        if(L == R){
            return arr[L];
        }

        int mid = L + ((R-L) >>1);
        int leftMax = getMax(arr,L,mid);
        int rightMax = getMax(arr,mid+1,R);
       return Math.max(leftMax, rightMax);
   }

}
