public class FPrint {
    /* 
    // 5 4 3 2 1
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    */


    /* 
    //1 2 3 4 5 
    public static void main(String[] args) {
        funRev(5);
    }
    static void funRev(int n) {
        if(n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    */



    //5 4 3 2 1 1 2 3 4 5 
    public static void main(String[] args) {
        funBoth(5);
    }
    static void funBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
