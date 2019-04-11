package Student;

public class Student {
    private String name;
    private int rating;
    public static double count;
    public static double sum;
    public static double AvgRating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
        sum+=rating;
        AvgRating=sum/count;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public Student() { count++;}

    public static double getAvgRating() {
      if(count==0.00) {return AvgRating=0.00;}
      else {
      return AvgRating;
    }}


    public  boolean betterStudent(Student student2) {
        return getRating() > student2.rating;
    }

    @Override
    public String toString() {
        return "Student [Name = "+getName()+", rating "+getRating()+"]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sum+=rating;
        AvgRating=sum/count;

    }

    public void changeRating(int rating) {
        int irating = rating;
        double drating = irating;
        sum-= this.rating;
        sum+= drating;
        this.rating=rating;
        AvgRating=sum/count;
    }

    public static void removeStudent(Student student) {
        count--;
        sum-=student.rating;
        AvgRating=sum/count;
        student = null;
    }
}
