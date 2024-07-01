import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Quân", "Hà nội"));
        students.add(new Student(2, "Nam", "Hà nội"));
        students.add(new Student(3, "Mạnh", "Hưng yên"));
        students.add(new Student(4, "Trung", "Hải dương"));
        students.add(new Student(5, "An", "Huế"));
        writeDataToFile("student.txt", students);
        List<Student> readStudents = readDataFromFile("student.txt");
        for (Student student : readStudents) {
            System.out.println(student);
        }
    }
}