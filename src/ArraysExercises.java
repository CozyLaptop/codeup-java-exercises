import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static Scanner sc = new Scanner(System.in);

    public static Person[] addPerson (Person[] people, Person newPerson){
        Person[] newArr = Arrays.copyOf(people, people.length + 1);
        newArr[people.length] = newPerson;
        System.out.println();
        return newArr;
    }
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("M0pie");
        people[1] = new Person("GrayWolf");
        people[2] = new Person("Jor");
        for(Person person : people){
            System.out.println(person.getName());
        }
        System.out.println("Enter the name of your person: ");
        Person newPerson = new Person(sc.nextLine());
        people = addPerson(people, newPerson);
        System.out.println("Now the people list is: ");
        for(Person person : people){
            System.out.println(person.getName());
        }
    }
}
