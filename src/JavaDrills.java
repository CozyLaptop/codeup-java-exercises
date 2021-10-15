import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Work in progress flip first and last character
public class JavaDrills {
    public static String flipOuterCase(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (i == 0 || i == str.length() - 1){
                if (Character.isUpperCase(c)){
                    newString += Character.toString(c).toLowerCase();
                } else newString += Character.toString(c).toUpperCase();
            } else newString += c;
        }
        return newString;
    }
    public static int returnTotalDifference(List<Integer> numbers1, List<Integer> numbers2)
    {
        int sumOfList1 = 0;
        int sumOfList2 = 0;
        for (int num: numbers1) {
            sumOfList1 += num;
        }
        for (int num: numbers2) {
            sumOfList2 += num;
        }
        return sumOfList1 - sumOfList2;
    }
    public static void main(String[] args) {
        System.out.println(flipOuterCase("great"));
        System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));
    }
}
