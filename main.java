package OOP_Home_work5.idea;

public class main {
    public static void main(String[] args) {
        TeacherService model = new TeacherService();
        TeacherView view = new TeacherView();
        TeacherController controller = new TeacherController(model, view);

        controller.run();
    }
}

