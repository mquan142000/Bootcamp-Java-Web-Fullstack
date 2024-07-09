public class Client {
    public static void main(String[] args) {
        RandomListFacade facade = new RandomListFacade();

        int size = 10; // Số lượng số ngẫu nhiên cần tạo
        int min = 1; // Giá trị nhỏ nhất của số ngẫu nhiên
        int max = 100; // Giá trị lớn nhất của số ngẫu nhiên

        facade.printRandomEvenList(size, min, max); // Sử dụng RandomListFacade để in danh sách số chẵn ngẫu nhiên
    }
}