
import java.util.Scanner;
public class Lab1_Bai1_DTB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.print("Nhập điểm trung bình: ");
        double score = scanner.nextDouble();
        System.out.println("Họ tên: " + name);
        System.out.println("Điểm: " + score);
        scanner.close();
	}
}
