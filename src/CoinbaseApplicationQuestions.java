import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinbaseApplicationQuestions {

    public static List<Integer> reverseArray(List<Integer> arr) {
        List<Integer> reversedNums = new ArrayList<>();
        int numbersLeft = arr.get(0);
        int indexFoundAt = 0;
        while (numbersLeft > 0) {
            int largestNumber = 0;
            for (int i = 1; i <= arr.size() - 1; i++) {
                if (arr.get(i) > largestNumber) {
                    largestNumber = arr.get(i);
                    indexFoundAt = i;
                }
            }
            reversedNums.add(largestNumber);
            arr.set(indexFoundAt, 0);
            numbersLeft--;
        }
        return reversedNums;
    }

    public static void main(String[] args) {
        List<Integer> numsToReverse = Arrays.asList(6,3,2,4,5,5,6);
        System.out.println(reverseArray(numsToReverse));
    }
}

