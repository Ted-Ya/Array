public class BiSearch {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,11,12};
        int index = biSearch(arr,4);
        System.out.print(index);
    }

    /**
     * With an uprising ordered array, to search a number, this num exist return its index,
     * if not return -1
     * * @param arr an uprising ordered array
     */
    private static int biSearch(int[] arr,int n){
       if(arr == null){
           return -1;
       }

       int l = 0;
       int r = arr.length -1;
       int mid = l + ((r-l)>>1);
       while (mid >= l && mid <= r){
           if(arr[mid] ==n){
               return  mid;
           }else  if(arr[mid] < n){
               l = mid +1;
           }else {
               r = mid;
           }
           mid = l + ((r-l)>>1);
       }
       return  -1;
    }
}
