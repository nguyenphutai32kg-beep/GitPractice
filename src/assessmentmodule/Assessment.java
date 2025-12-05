package assessmentmodule;

public class Assessment {
    public String examId;
    public String type;
    public int score;

    public void submitExam() {
        System.out.println("Assessment: ");
        System.out.println("Submitting " + type + " (ID: " + examId + ") ");
        System.out.println("Score: " + score + " ");
    }
}