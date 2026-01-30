import java.util.Scanner;
import java.text.DecimalFormat;
public class QuyDoiTien {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###,###");
        System.out.print("Nhập USD: ");
        double usd = scanner.nextDouble();
        double usdtovnd = usd * 23500;
        System.out.println(df.format(usd) + " USD = " + df.format(usdtovnd) +" VNĐ");
        System.out.print("Nhập EUR: ");
        double eur = scanner.nextDouble();
        double eurtovnd = eur * 27000;
        System.out.println(df.format(eur) + " EUR = " + df.format(eurtovnd) +" VNĐ");
        scanner.close();

	}

}
