import java.util.Scanner;
public class Bai3_GiaiPT {
//ax+b=0
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
		if(a==0) {
			if(b==0) {
				System.out.println("PT vô số nghiệm");
			}else {
			System.out.println("PT vô nghiệm");
			}
		}else {
			System.out.println("x = " +(-b/a));
		}
	}
}
