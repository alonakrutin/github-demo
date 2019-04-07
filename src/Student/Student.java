package Student;

public class Student {
    private String name;
    private int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() { }

    public static boolean betterStudent(int a, int b) {
        return a > b;
    }

    public static int av(int r1, int r2, int r3) {
        int s = 0;
        s = (r1 + r2 + r3) / 3;
        return s;
    }

    public String toString() {
        System.out.println(name);
        return name;
    }

    public String toString(String s1) {
        System.out.println(s1 + " ");
        return (s1);
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
    }

    public int changeRating(int rating) {
        int newrating = 0;
        newrating = rating + 10;
        return newrating;
    }
}
