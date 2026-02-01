import java.util.Scanner;
import java.util.Random;
public class DoanSo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choiTiep;
        do {
        	int CorrectNumber = random.nextInt(100) + 1;
        	int solanDoan = 0;
        	int maxattemps = 10;
        	boolean Winner = false;
        	System.out.println("---GAME ĐOÁN SỐ---");
        	for(int i =1;i<=10;i++) {
        		System.out.println("Lượt "+ i +" - Nhập số đoán: ");
        		int duDoan = scanner.nextInt();
        		solanDoan = i;
        		if(duDoan == CorrectNumber) {
        			System.out.println("Bạn đã thắng !");
        			Winner = true;
        			break;
        		}else if(duDoan < CorrectNumber) {
        			System.out.println("Trên số đó");
        		}else System.out.println("Nhỏ hơn số đó");
        	}
        	if(Winner == true) {
        		int diem = (maxattemps - solanDoan + 1) *10;
        		System.out.println("Điểm của bạn: " + diem);
        	} else {
        		System.out.println("Bạn đã thua ! Số đó là: " + CorrectNumber);
        	}
        	System.out.print("Bạn có muốn chơi lại ?(1: có/ 2: không)");
        	choiTiep = scanner.nextInt();
        }while (choiTiep == 1);
        System.out.println("Cảm ơn bạn đã chơi game! Hẹn gặp lại.");
        scanner.close();
	}

}
