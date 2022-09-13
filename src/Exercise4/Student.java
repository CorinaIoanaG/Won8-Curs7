package Exercise4;

public class Student {
    private static float sumOfGrades = 0.0F;
    private static int numberOfStudents =0;
    private final String studentName;
    private final float studentGrade;


    public Student(String studentName, float studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        sumOfGrades += studentGrade;
        numberOfStudents ++;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getStudentGrade() {
        return studentGrade;
    }

    static float averegeGrade() {
        return sumOfGrades/ numberOfStudents;
    }
}
