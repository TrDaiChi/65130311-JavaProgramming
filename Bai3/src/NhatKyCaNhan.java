import java.io.*;
import java.util.Scanner;
public class NhatKyCaNhan {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("=== NHẬT KÝ CÁ NHÂN ===");
            System.out.println("1. Viết nhật ký");
            System.out.println("2. Đọc nhật ký");
            System.out.print("Lựa chọn của bạn (1/2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // --- Ghi nhật ký ---
                System.out.print("Tiêu đề: ");
                String title = scanner.nextLine();
                
                System.out.print("Nội dung: ");
                String content = scanner.nextLine();
                try {
                    FileWriter writer = new FileWriter("nhatky.txt", true);
                    
                    writer.write("---------------------------\n");
                    writer.write(String.format("Tiêu đề: %s\n", title.toUpperCase()));
                    writer.write(String.format("Nội dung: %s\n", content));                    
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }

            } else if (choice == 2) {
                // --- Đọc nhật ký ---
                try {
                    File file = new File("nhatky.txt");
                    if (file.exists()) {
                        Scanner fileReader = new Scanner(file);
                        while (fileReader.hasNextLine()) {
                            System.out.println(fileReader.nextLine());
                        }
                        fileReader.close();
                    } else {
                        System.out.println("Trống!");
                    }
                } catch (IOException e) {
                    System.out.println("Lỗi đọc file: " + e.getMessage());
                }
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }

            scanner.close();
    }
}
