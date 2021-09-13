public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("M0pie");
        people[1] = new Person("GrayWolf");
        people[2] = new Person("Jor");
        for(Person person : people){
            System.out.println(person.getName());
        }
    }
}
