import java.util.Scanner;
public class Lab1_Bai2_ChuviDT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		int d = scanner.nextInt();
		System.out.print("Nhập chiều rộng: ");
		int r = scanner.nextInt();
		System.out.println("Chu vi: " + (d+r)*2);
		System.out.println("Diện tích: " + (d*r));
		int canhNho = Math.min(d,r);
		System.out.printf("Cạnh nhỏ: %d",canhNho);
		scanner.close();
	}
}
