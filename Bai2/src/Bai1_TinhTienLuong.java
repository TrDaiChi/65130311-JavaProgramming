
public class Bai1_TinhTienLuong {
	public static void main(String[] args) {
        int soGiolam = 56;
        int luongGio = 25;
        double tongLuong;
        if(soGiolam <= 40) {
        	tongLuong = soGiolam * luongGio;
        }
        else { tongLuong = 40*luongGio + (soGiolam -40) *luongGio * 1.5;
        }
        System.out.println("Số giờ làm: " + soGiolam);
        System.out.println("=>> Tổng lương: " + tongLuong);
	}
}
