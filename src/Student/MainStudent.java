package Student;

//import static Student.Student.betterStudent;
//import static Student.Student.getAvgRating;

public class MainStudent {
    public static void main(String[] args) {
        // Create 3 students and print info about students
        Student student1 = new Student();
        student1.setName("Ivanov");
        student1.setRating(50);
        System.out.println(student1.toString()) ;
        student1.toString();

        Student student2 = new Student("Petrov");
        student2.setRating(60);
        System.out.println(student2.toString()) ;

        Student student3 = new Student("Sidorov", 70);
        System.out.println(student3.toString()) ;

        // print average rating
         System.out.println("The average rating of all students = " + Student.getAvgRating());

        //change rating for Student1 and print new average rating
        student1.changeRating(80);
        System.out.println("New rating for student1 is  " + student1.getRating());
        System.out.println("The new average rating of all students = " + Student.getAvgRating());

       // print better student
        System.out.println("Is Student1 " + student1.getName() + " better than student2 " + student2.getName() + "? ->>" + student1.betterStudent(student2));


    }
}
