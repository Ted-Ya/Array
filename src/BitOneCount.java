/**
 * 数一个数有多少个1
 */
public class BitOneCount {

    public static void main(String[] args) {
       int n = 9;
       int oneNum = bitOneCount(n);
       System.out.println(oneNum);
    }

    private static int bitOneCount(int n){
        int counts = 0;
        while (n !=0){
            int rightOne = n & ((~n)+1);
             counts++;
             n^=rightOne;
        }
        return counts;
    }
}
