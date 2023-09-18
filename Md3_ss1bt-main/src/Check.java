import javax.swing.*;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 số : ");
        int number = scanner.nextInt();
//        String result = "";
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("chia hết cho cả 3 và 5 ");
        } else if (number % 3 == 0) {
            System.out.println(" chỉ chia hết cho 3");
        } else if (number % 5 == 0) {
            System.out.println("chỉ chia hết cho 5 ");
        } else {
            System.out.println("không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}
