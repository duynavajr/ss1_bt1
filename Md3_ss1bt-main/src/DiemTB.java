import java.util.Scanner;

public class DiemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập điểm môn Toán");
        double Toan = scanner.nextDouble();
        System.out.println("nhập điểm môn Lý");
        double Ly = scanner.nextDouble();
        System.out.println("nhập điểm môn Hóa");
        double Hoa = scanner.nextDouble();
        System.out.println("nhập điểm môn Văn");
        double Van = scanner.nextDouble();
        System.out.println("nhập điểm môn Tiếng Anh");
        double Ta = scanner.nextDouble();

        double TongDiemTB = (Toan + Ly + Hoa + Van + Ta) / 5;

        String HocL = "";

        if (TongDiemTB >= 9) {
            System.out.println("Điểm TB Xếp loại xuất sắc");
        } else if (TongDiemTB >= 8) {
            System.out.println("Xếp loại giỏi");
        } if (TongDiemTB >= 6.5) {
            System.out.println("xếp loại khá ");
        } else if (TongDiemTB >= 5) {
            System.out.println("Xếp loại trung bình ");
        } else {
            System.out.println("Xếp loại yếu ");
        }

        System.out.println(TongDiemTB);
        System.out.println(HocL);
    }
}
