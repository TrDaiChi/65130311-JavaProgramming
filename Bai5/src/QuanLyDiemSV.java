import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class QuanLyDiemSV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Map<String, Integer> studentScores = new HashMap<>();
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<n;i++) {
        	System.out.print("Nhập tên SV thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập điểm cho " + name + ": ");
            int score = scanner.nextInt();
            scanner.nextLine();
            studentScores.put(name, score);
        }
        System.out.println("---Danh sách điểm:----");
        for (var entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        List<Integer> scores = studentScores.values().stream().collect(Collectors.toList());
        
        double avg = scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        
        int max = scores.stream().mapToInt(Integer::intValue).max().orElse(0);
        
        int min = scores.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println("--- THỐNG KÊ ---");
        System.out.println("Điểm trung bình: " + avg);
        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
        System.out.println("Sắp xếp tăng dần: ");
        studentScores.entrySet().stream()
               .sorted(Map.Entry.comparingByValue())
               .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        scanner.close();
	}
}
