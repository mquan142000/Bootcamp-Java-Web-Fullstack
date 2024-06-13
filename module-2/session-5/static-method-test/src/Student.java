public class Student {
    private int id;
    private String name;
    private static String college = "HELLO";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    static void change(){
        college = "WORLD";
    }

    void display(){
        System.out.println(id + " " + name + " " + college);
    }
}