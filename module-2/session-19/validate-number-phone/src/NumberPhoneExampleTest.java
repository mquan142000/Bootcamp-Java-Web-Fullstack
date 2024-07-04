public class NumberPhoneExampleTest {

    private static NumberPhoneExample numberPhoneExample;

    public static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222), (84)-(22b22222), (84)-(9978489648)"};

    public static void main(String[] args) {
        numberPhoneExample = new NumberPhoneExample();
        for (String phone : validPhone) {
            boolean isValid = numberPhoneExample.validate(phone);
            System.out.println("Phone: " + phone + " is valid: " + isValid);
        }
        for (String phone : invalidPhone) {
            boolean isValid = numberPhoneExample.validate(phone);
            System.out.println("Phone: " + phone + " is valid: " + isValid);
        }
    }
}
