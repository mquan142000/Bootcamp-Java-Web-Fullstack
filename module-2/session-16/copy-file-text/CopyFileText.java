import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String filePath) {
        List<String> content = new ArrayList<>();
        try {
            //Đọc file theo đường dẫn
            File file = new File(filePath);
            //Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException("File không tồn tại.");
            }
            //Đọc từng dòng của file
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
            br.close();
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
        return content;
    }

    public void writeFile(String filePath, List<String> content) {
        try {
            //Đọc từng dòng của file
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            for (String line : content) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> content = copyFileText.readFile("copy-file-text/src/source.txt");
        copyFileText.writeFile("copy-file-text/src/target.txt", content);
    }
}
