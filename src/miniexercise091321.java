public class miniexercise091321 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2 ,3, 4};
        double[] numbers2 = new double[5];
        numbers2[0] = 0;
        numbers2[1] = 1;
        numbers2[2] = 2;
        numbers2[3] = 3;
        numbers2[4] = 4;
        int result = 0;
        for (int number : numbers) {
            result += number;
            System.out.println("Your result: ");
            System.out.println(result);
        }
        result = 0;
        for (double number : numbers2){
            result += number;
            System.out.println("Your result: ");
            System.out.println(result);
        }
    }
}
