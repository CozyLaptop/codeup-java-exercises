public class javaexercise101621 {
//    Add an array of numbers and return the sum
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
