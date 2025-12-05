import usermodule.user;
import coursemodule.course;
import paymentmodule.payment;
import assessmentmodule.Assessment;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-LEARNING SYSTEM FULL FLOW ===");

        user student = new user();
        student.id = "SV001";
        student.name = "Nguyen Van A";
        student.role = "Student";
        student.login();

        course javaCourse = new course();
        javaCourse.courseId = "Java";
        javaCourse.title = "Java for beginner";
        javaCourse.price = 1000000;
        javaCourse.showCourse();

        Assessment finalExam = new Assessment();
        finalExam.examId = "CK1";
        finalExam.type = "KT Cuoi Ky";
        finalExam.score = 85;
        finalExam.submitExam();

        System.out.println("\nCompleted");
    }
}