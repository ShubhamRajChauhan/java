public class CNumbersExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes a number and prints it
        //print first 5 numbers : 1 2 3 4 5
        print(1);
    }

    static void print(int n) {
        if(n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }   
}