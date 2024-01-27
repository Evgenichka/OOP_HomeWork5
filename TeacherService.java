package OOP_Home_work5.idea;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List<Teacher> data;
    private Object teacher;

    public TeacherService() {
        data = new ArrayList<>();
    }

    void addTeacher() {
        data.add((Teacher) teacher);
    }

    public List<Teacher> getData() {
        return data;
    }


    public void removeTeacher(Teacher dateToRemove) {
        data.remove(teacher);

    }

    public Object getId() {
        Object id = new Object();
        return id;
    }

    public void setId(Object id) {
    }

    public void removeTeacher() {

    }
}