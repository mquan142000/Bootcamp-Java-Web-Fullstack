import entity.Country;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryManager {
    public void readCountryManager(String filePath) {

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return;
        }
        List<Country> countries = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            //Đọc từng dòng của file CSV
            String line = "";
            while ((line = br.readLine()) != null) {
                List<String> values = parseCsvLine(line);
                //Kiểm tra số lượng phần tử
                if (values.size() == 3) {
                    int id = Integer.parseInt(values.get(0));
                    String name = values.get(1).replace("\"", "");
                    ;
                    String code = values.get(2).replace("\"", "");
                    Country country = new Country(id, name, code);
                    countries.add(country);
                } else {
                    System.out.println("Invalid CSV line: " + line);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] values = csvLine.split(",");
            for (String value : values) {
                result.add(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        CountryManager countryManager = new CountryManager();
        countryManager.readCountryManager(path);
    }
}
