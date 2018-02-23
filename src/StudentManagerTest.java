public class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.add(new Student("Andy", 23));
        studentManager.add(new Student("Booby", 25));
        studentManager.add(new Student("Sam", 22));

        studentManager.displayAll();

        studentManager.find("Andy");
    }
}
