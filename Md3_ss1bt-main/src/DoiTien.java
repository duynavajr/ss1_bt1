import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        double rate = 23000;
        System.out.println("nhập vào 1 số :");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd *rate;
        System.out.println("hiển thị giá trị vnd " + vnd );
    }
}
