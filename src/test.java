public class test {

    public static void main(String[] args) {

        Integer c = 128;
        Integer d = 128;

        System.out.println(c .equals(d));

//        swap(a,b);
//        System.out.println(a);
//        System.out.println(b);
    }


    /**
     * swap two numbers value, in the process do not allow produce more variable
     *
     * @param a first number
     * @param b second number
     */
    private static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
