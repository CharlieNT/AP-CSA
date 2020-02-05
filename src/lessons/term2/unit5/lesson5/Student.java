package lessons.term2.unit5.lesson5;

public class Student {
    private static int counter;
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    private int id;

    public Student() {
        this("None", "None", 0, 0);
    }

    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (gradeLevel >= 0 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        } else {
            this.gradeLevel = 0;
        }

        if (gpa >= 0.0 && gpa <= 4.5) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }

        counter++;
        id = counter;
    }

    public String toString() {
        return lastName + ", " + firstName + "\n"
                + "GPA: " + gpa + "\n"
                + "Grade Level: " + gradeLevel + " id # " + id;
    }

}