package Exercise4;

public class Main {
    static float sumOfGrades = 0.0F;
    static int numberOfStudents = 10;

    public static void main(String[] args) {
        Student student1 = new Student("Ana B", 8.65f);
        sumOfGrades += student1.getStudentGrade();
        System.out.println(student1.getStudentName() + ": " + student1.getStudentGrade());
        Student student2 = new Student("Bogdan D", 9.05f);
        sumOfGrades += student2.getStudentGrade();
        System.out.println(student2.getStudentName() + ": " + student2.getStudentGrade());
        Student student3 = new Student("Aurelia M", 7.89f);
        sumOfGrades += student3.getStudentGrade();
        System.out.println(student3.getStudentName() + ": " + student3.getStudentGrade());
        Student student4 = new Student("Georgiana H", 9.95f);
        sumOfGrades += student4.getStudentGrade();
        System.out.println(student4.getStudentName() + ": " + student4.getStudentGrade());
        Student student5 = new Student("Mihai G", 8.05f);
        sumOfGrades += student5.getStudentGrade();
        System.out.println(student5.getStudentName() + ": " + student5.getStudentGrade());
        Student student6 = new Student("Silviu A", 9.11f);
        sumOfGrades += student6.getStudentGrade();
        System.out.println(student6.getStudentName() + ": " + student6.getStudentGrade());
        Student student7 = new Student("Diana C", 9.85f);
        sumOfGrades += student7.getStudentGrade();
        System.out.println(student7.getStudentName() + ": " + student7.getStudentGrade());
        Student student8 = new Student("Adina Z", 8.22f);
        sumOfGrades += student8.getStudentGrade();
        System.out.println(student8.getStudentName() + ": " + student8.getStudentGrade());
        Student student9 = new Student("Flaviu S", 7.85f);
        sumOfGrades += student9.getStudentGrade();
        System.out.println(student9.getStudentName() + ": " + student9.getStudentGrade());
        Student student10 = new Student("Daria E", 9.15f);
        sumOfGrades += student10.getStudentGrade();
        System.out.println(student10.getStudentName() + ": " + student10.getStudentGrade());
        System.out.println("Averege grade of all students: " + averegeGrade());
    }

    private static float averegeGrade() {
        return sumOfGrades / numberOfStudents;
    }
}
