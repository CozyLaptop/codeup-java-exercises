import java.util.Arrays;
import java.util.List;

public class Test {
    static void checkNumbers(){
//        Start from -10 all the way to 10;
        int X;
        int Y;
        System.out.println("X | Y");
        for (X = -10; X <= 10; X++){
            for (Y = -10; Y <= 10; Y++){
                if ((X > 1 || X == 0) && Y>=7){
                    System.out.print(X);
                    System.out.print("|");
                    System.out.print(Y);
                    System.out.println("");
                }
            }
        }
    }
    static void checkNumbersReverse(){
//        Start from -10 all the way to 10;
        int X;
        int Y;
        System.out.println("X | Y");
        for (X = -10; X <= 10; X++){
            for (Y = -10; Y <= 10; Y++){
                if ((X <= 1 && (X > 0 || X < 0) || Y < 7)) {
                    System.out.print(X);
                    System.out.print("|");
                    System.out.print(Y);
                    System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args) {
        checkNumbers();
        checkNumbersReverse();
        checkBirthday(12, 30, 1994, 6, 30, 2021);
        reverseVariables();
        int posInsertedAt = 0;
        boolean inserted = false;
        int[] sortedArray =  {1,3,8,90,100};
        int[] newSortedArray = new int[sortedArray.length + 1];
        int insertNumber = 50;
        for(int i = 0; i < sortedArray.length; i++){
            if(insertNumber >= sortedArray[i]){
                newSortedArray[i] = sortedArray[i];
            } else if (insertNumber < sortedArray[i]){
                newSortedArray[i] = insertNumber;
                posInsertedAt = i;
                inserted = true;
                break;
            }
        }
        for (int i = posInsertedAt + 1; i < newSortedArray.length; i++){
            if (inserted){
                newSortedArray[i] = sortedArray[i - 1];
            } else {
                newSortedArray[sortedArray.length] = insertNumber;
            }
        }
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(newSortedArray));
    }

    private static void checkBirthday(int birthdayMonth, int birthdayDay, int birthdayYear, int currentMonth, int currentDay, int currentYear){
        int yearsOld = currentYear - birthdayYear - 1;
        if (currentMonth >= birthdayMonth && currentDay >= birthdayDay){
            yearsOld += 1;
        }
        System.out.println(yearsOld);
    }
    private static void reverseVariables(){
//        I need to make Y = X and X = Y;
        int x = 7;
        int y = 9;
        x = x + y; // 7 + 9 = 16
        y = x - y; // 16 - 9 = 7
        x = x - y; // 16 - 7 = 9
        System.out.println(x);
        System.out.println(y);
    }
}
