import java.util.Scanner;

public class NumberToWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập một số từ 0 đến 9 hoặc -1 để thoát: ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Chương trình đã kết thúc.");
                break;
            }
            String[] words = {"Số Không", "Số Một", "Số Hai", "Số Ba", "Số Bốn", "Số Năm", "Số Sáu", "Số Bảy", "Số Tám", "Số Chín"};

            if (number >= 0 && number <= 9) {
                System.out.println(words[number]);
            } else {
                System.out.println("Số không hợp lệ");
            }
        }
    }
}
