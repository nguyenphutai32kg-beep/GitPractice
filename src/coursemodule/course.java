package coursemodule;

public class course {
    public String courseId;
    public String title;
    public double price;

    public void showCourse() {
        System.out.println("course: " + title + " ");
        System.out.println("ID: " + courseId);
        System.out.println("Price: " + price + " VND");
    }
}