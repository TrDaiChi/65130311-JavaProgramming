import java.util.Scanner;
public class TinhTienDienvaBacThang {
	public static double TinhTienDien(double kwh) {
		double tien = 0;

        if (kwh <= 50) {
            tien = kwh * 3000;
        } else if (kwh <= 100) {
            tien = (50 * 3000) + ((kwh - 50) * 3500);
        } else if (kwh <= 200) {
            tien = (50 * 3000) + (50 * 3500) + ((kwh - 100) * 4000);
        } else if (kwh <= 300) {
            tien = (50 * 3000) + (50 * 3500) + (100 * 4000) + ((kwh - 200) * 4500);
        } else {
            tien = (50 * 3000) + (50 * 3500) + (100 * 4000) + (100 * 4500) + ((kwh - 300) * 5000);
        } 

        return tien;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        double soKwh = scanner.nextDouble();

        if (soKwh < 0) {
            System.out.println("Số điện không thể âm, Kiểm tra lại!");
        } else {
            double tongTien = TinhTienDien(soKwh);
            System.out.println("--- KẾT QUẢ ---");
            System.out.println("Tiền điện: " + (tongTien) + " VNĐ");
        }

        scanner.close();

	}

}
