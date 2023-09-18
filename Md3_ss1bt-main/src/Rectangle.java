import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);

        scanner.close();
    }


}
