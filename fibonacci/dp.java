public class dp {

/* get the nth number in the fibonacci sequence
 * @param n the number in the fibonacci sequence
 * @return the nth number in the fibonacci sequence
*  */

    // top down

    // in this method we will be doing recursion + dp, so we will be encountering the same problem multiple times
    // so we need to solve the problem once and store the result in a table
    // since we are only solving each subproblem once, its o(N) time complexity
    // we will be using an array to store the result of the subproblems, so O(n) space complexity

    public static int[] grid;

    public static int filled = 3;


    public static int fibonacci(int n) {
        if((n == 0) || (n ==1)){
            return n;
        }
        grid[0] = 0;
        grid[1] = 1;
        grid[2] = 1;
        if(filled >= (n+1)){
            return grid[n];
        }

        grid[n] = fibonacci(n-2) + fibonacci(n-1);
        filled++;
        return grid[n];
    }

    public static void main(String[] args){
        int number = 10; // 5th number in the fibonacci sequence
        grid = new int[number +1];
        int result = Recursive.fibonacci(number);
        System.out.println("The number is " + result);
    }
}
