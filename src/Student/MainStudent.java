package Student;

import static Student.Student.betterStudent;
import static Student.Student.av;

public class MainStudent {
    public static void main(String[] args) {
        // Create 3 students and print info about students
        Student student1 = new Student();
        student1.setName("Ivanov");
        student1.setRating(90);
        student1.toString("Student1 name is: " + student1.getName());
        student1.toString("Student1 rating is: " + student1.getRating());

        Student student2 = new Student("Petrov");
        student2.setRating(40);
        student2.toString("Studen2 name is: " + student2.getName());
        student2.toString("Student2 rating is: " + student2.getRating());

        Student student3 = new Student("Sidorov", 82);
        student3.toString("Student3 name is: " + student3.getName());
        student3.toString("Student3 rating is: " + student3.getRating());

        // print average rating
        System.out.println("The average rating of all students = " + Student.av(student1.getRating(), student2.getRating(), student3.getRating()));

        //change rating for Student1 and print new average rating
        System.out.println("New rating for student1 is  " + student1.changeRating(student1.getRating()));
        student1.setRating(student1.changeRating(student1.getRating()));
        System.out.println("The new average rating of all students = " + Student.av(student1.getRating(), student2.getRating(), student3.getRating()));

       // print better student
        System.out.println("Is Student1 " + student1.toString(student1.getName()) + " better than student2 " + student1.toString(student2.getName()) + "? ->>" + Student.betterStudent(student1.getRating(), student2.getRating()));


    }
}
