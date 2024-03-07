import java.util.*;

/* 
 * 1st Method:
 * searched the array only once, went from beginning and end to the middle
 * []
 * 2nd Method:
 * searched the array twice, once for the largest number and once for the second-largest number
 */

public class answer {
    public static int MaxPairwiseProduct(ArrayList<Integer> numbers) {
        // Enter your code here

        if ((numbers == null) || (numbers.size() == 1)) {
            return 0;
        }

        int large = 1;
        int small = 0;
        int indexRight = numbers.size() - 1;
        int indexLeft = 0;

        while (indexRight > indexLeft) {

            int biggerNum = 0;
            int smallerNum = 0;
            if (numbers.get(indexRight) > numbers.get(indexLeft)) {
                biggerNum = numbers.get(indexRight);
                smallerNum = numbers.get(indexLeft);
            } else {
                smallerNum = numbers.get(indexRight);
                biggerNum = numbers.get(indexLeft);
            }

            if (biggerNum >= large) {
                large = biggerNum;
                if (smallerNum > small) {
                    small = smallerNum;
                }
            } else if (biggerNum > small) {
                small = biggerNum;
            }

            if (!((indexLeft + 2) == indexRight)) {
                indexRight = indexRight - 1;
            }
            indexLeft = indexLeft + 1;
            // if in the middle and not odd
        }

        return (large * small);
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 0, 0, 0, 0, 10, 2));
        int result = answer.MaxPairwiseProduct(numbers);
        System.out.println("The maximum pairwise product is: " + result);
    }

    
}