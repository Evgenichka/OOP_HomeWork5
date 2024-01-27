package OOP_Home_work5.idea;
public class Teacher {
    private String firstName;
    private String lastName;
    private String email;
    private String id;
    private Object teacher;


    public Teacher(String firstName, String lastName, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public void add(Object teacher) {
        this.teacher = teacher;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = lastName;
    }

    public void setEmail(String newEmail) {
        this.email = email;
    }

    public void setId(String newId) {
        this.id = id;
    }
}



