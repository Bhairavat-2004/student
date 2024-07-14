import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private Map<String, Integer> courseMarks = new HashMap<>();

    public void addCourseMark(String courseName, int mark) {
        courseMarks.put(courseName, mark);
    }

    public void displayCoursesAndMarks() {
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}
