
public class GetOddNumber {

    public static void main(String[] args) {

//        int[] arr1 = {1, 2, 3, 3, 1, 1, 2, 2, 4, 4, 3, 2, 1};
//        printOddTimesNum1(arr1);

        int[] arr2 = {1, 2, 3, 3, 1, 1, 2, 2, 4, 4, 3, 2, 1,1};
        printOddTimeNum2(arr2);
    }

    //  一个数组中有一种出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数
    // 异或满足交换律与结合律 即一组数相互异或 ，异或的先后顺序是无关紧要的
    // 该案例中 即定义出变量 int eor = 0 与 数组中的元素进行异或 ，最后剩余的元素便是出现奇数次的元素

    /**
     * Within an arr that contains a lot of elements, there is a type of element appears numbers are odd numbers,another
     * elements appear numbers are even number,How could we this element ?
     * <p>
     * using exclusive or way to find this element
     */
    private static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int j : arr) {
            eor ^= j;
        }
        System.out.println(eor);
    }

    // 数组中，有两种数出现了奇数次，找到这个两种数并打印出来
    // 1.将数组元素异或一轮会得到 : eor = a^b 的结果
    // 2. eor != 0 , 必然有一个位置为1
    // 3. 找到 eor 最右侧位置的 1 :n&((~n) +1)
    // 4. 找出 arr 中该为1 的元素
    // 5. 再将 arr1 的元素全异或一遍 得到数 即为 a or b
    private static void printOddTimeNum2(int[] arr) {
        int eor = 0;
        for(int i =0;i < arr.length; i++){
            eor ^= arr[i];
        }

        int eorRight = eor &((~eor)+1);
        int eorA = 0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] & eorRight) !=0){
                eorA ^=arr[i];
            }
        }

        int b = eor ^ eorA;
        System.out.println(eorA +" " + b);
    }
}
