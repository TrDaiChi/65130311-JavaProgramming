import java.util.Scanner;

public class Lab1_Bai3_TheTich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh: ");
		int n = scanner.nextInt();
		System.out.println("Thể tích khối lập phương: " +(n*n*n));
		scanner.close();
	}
}
