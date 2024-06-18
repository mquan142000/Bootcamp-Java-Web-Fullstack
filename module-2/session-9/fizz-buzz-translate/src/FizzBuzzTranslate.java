public class FizzBuzzTranslate {
    public String translate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Số phải lớn hơn 0");
        }

        String numberStr = String.valueOf(number);
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 || numberStr.contains("3")) {
            return "Fizz";
        } else if (number % 5 == 0 || numberStr.contains("5")) {
            return "Buzz";
        } else {
            return numberToWord(number);
        }
    }

    private String numberToWord(int number) {
        String[] units = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (number < 10) {
            return units[number];
        } else if (number < 100) {
            int tenUnit = number / 10;
            int unit = number % 10;
            if (unit == 0) {
                return tens[tenUnit];
            } else if (tenUnit == 1) {
                return "mười " + units[unit];
            } else {
                return tens[tenUnit] + " " + units[unit];
            }
        } else {
            throw new IllegalArgumentException("Số phải nhỏ hơn 100");
        }
    }
}
