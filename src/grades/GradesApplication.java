package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static HashMap<String, Student> students;

    public static void main(String[] args) {
        Student student0 = new Student("Amanda");
        student0.addGrade(99);
        student0.addGrade(75);
        student0.addGrade(100);

        Student student1 = new Student("Fred");
        student1.addGrade(55);
        student1.addGrade(44);
        student1.addGrade(100);

        Student student2 = new Student("Daffknee");
        student2.addGrade(99);
        student2.addGrade(100);
        student2.addGrade(100);

        Student student3 = new Student("Lillypad");
        student3.addGrade(80);
        student3.addGrade(70);
        student3.addGrade(85);

        System.out.printf("The Student %s has a grade average of %.2f ", student0.getName(), student0.getGradeAverage());
        System.out.println();
        System.out.printf("The Student %s has a grade average of %.2f ", student1.getName(), student1.getGradeAverage());
        System.out.println();
        System.out.printf("The Student %s has a grade average of %.2f ", student2.getName(), student2.getGradeAverage());
        System.out.println();
        System.out.printf("The Student %s has a grade average of %.2f ", student3.getName(), student3.getGradeAverage());

        students = new HashMap<>();
        students.put("amandapanda", student0);
        students.put("freddymeyers", student1);
        students.put("betterthanu", student2);
        students.put("lilfroggy", student3);
        System.out.println();
        gradesApp();
    }

    public static void gradesApp(){
        Scanner sc = new Scanner(System.in);
        for (String githubUsername : students.keySet()) {
            System.out.print("|" + githubUsername + "|");
        }
        System.out.println();
        System.out.println("Enter [1] to view all students grades, press [2] to view individual grades, anything else to quit.");
        String input = sc.nextLine();
        if (input.equals("1")) {
            viewAllGrades();
        } else if (input.equals("2")){
            System.out.println("Which user would you like to view?");
            input = sc.nextLine();
            if (students.containsKey(input)){
                Student student = students.get(input);
                System.out.println("Student name: " + student.getName());
                System.out.println("Github username: " + input);
                student.printGrades();
                System.out.printf("Current average: %.2f" ,student.getGradeAverage());
                System.out.println();
            } else {
                System.out.println("We don't recognize that name!");
            }
        } else return;
        System.out.println("Enter 'y' to continue.");
        if (sc.nextLine().equals("y")){
            gradesApp();
        }
    }
    public static void viewAllGrades(){
        for (Student student: students.values()){
            System.out.println(student.getName() + ": ");
            student.printGrades();
            System.out.println("-----------------");
        }
    }
}