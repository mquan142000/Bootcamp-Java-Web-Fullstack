public class ClassExampleTest {

    private static ClassExample classExample;

    public static final String[] validClass = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClass = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String regex : validClass) {
            boolean isValid = classExample.validate(regex);
            System.out.println("Class: " + regex + " is valid: " + isValid);
        }
        for (String regex : invalidClass) {
            boolean isValid = classExample.validate(regex);
            System.out.println("Class: " + regex + " is valid: " + isValid);
        }
    }
}
