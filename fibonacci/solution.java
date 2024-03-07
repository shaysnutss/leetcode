import java.util.*;

/*
* Given an integer k, return the minimum number of Fibonacci numbers whose sum is equal to k.
* The same Fibonacci number can be used multiple times.
* */

public class solution {
    public static void main(String[] args){
        int ans = findMinFibonacciNumbers(19);
        System.out.println(ans);

    }
    public static int findMinFibonacciNumbers(int k) {

        int remaining = k;
        if(( k == 1)){
            return 1;
        }
        // 0 1 1 2 3 5 7
        ArrayList<Integer> nums = formFibo(k);
        int ans = 1;

        while(remaining > 0){
            remaining = k - nums.get(nums.size() -1);

            for(int i = nums.size() - 2 ; i >=0 ; i-- ){
                if(remaining == 0){
                    break;
                }
                if(remaining >= nums.get(i)){
                    remaining = remaining - nums.get(i);
                    ans++;
                }
            }


        }
        return ans;

    }

    public static ArrayList<Integer> formFibo(int k){

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(1);
        int index = 2;

        while(nums.get(index) <= k){
            index++;
            nums.add(nums.get(index-2) + nums.get(index-1));
            if((nums.get(index) + nums.get(index-1)) > k){
                break;
            }
        }
        return nums;

    }
}// 4
// 0 1 1 2 3 5 7