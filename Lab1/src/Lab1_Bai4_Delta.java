import java.util.Scanner;
public class Lab1_Bai4_Delta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ax^2 + bx + c = 0
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        //delta = b^2-4ac;
        double delta = Math.pow(b,2) - 4*a*c;
        double canDelta = Math.sqrt(delta);
        System.out.println("Delta = " + delta );
        System.out.println("canDelta = " + canDelta );
        scanner.close();
	}

}
