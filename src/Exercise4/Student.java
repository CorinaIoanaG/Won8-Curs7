package Exercise4;

public class Student {
    private String studentName;
    private float studentGrade;
    public static float sumOfGrades = 0.0F;


    public Student(String studentName, float studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        sumOfGrades += studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getStudentGrade() {
        return studentGrade;
    }

}
