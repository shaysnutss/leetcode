public class iterative {

    /* get the nth number in the fibonacci sequence
     * @param n the number in the fibonacci sequence
     * @return the nth number in the fibonacci sequence
     *  */

    // bottom up approach

    // in this method we will be doing iteration + dp,
    // so we need to solve the problem once and store the result in a variable
    // since we are only solving each subproblem once, its o(N) time complexity
    // we will be using two variables to store the last two subproblems, so O(1) space complexity
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;

        if((n == 0) || (n ==1)){
            return n;
        }

        for(int i = 2; i<= n; i++){
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b;

    }

    public static void main (String[] args){
        int number = 8;
        int result = fibonacci(number);
        System.out.println("The number is " + result);
    }
}
