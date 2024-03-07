public class Recursive {

    public static int fibonacci(int n) {
        if((n == 0) || (n ==1)){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main (String[] args){

        int number = 5; // 5th number in the fibonacci sequence
        int result = fibonacci(5);
        System.out.println("The number is " + result);
    }
}
