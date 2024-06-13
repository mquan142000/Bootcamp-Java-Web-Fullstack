public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
