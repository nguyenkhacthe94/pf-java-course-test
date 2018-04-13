public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("javer");
        String andy = "andy";
        course.addStudent(andy);
        System.out.println(course.getName());
        System.out.println(course.getStudents());
        System.out.println(course.getStudentsCount());
    }
}