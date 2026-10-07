package exercise004;

import java.util.Scanner;

public class Exercise004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean isValid = false;

        // Sử dụng vòng lặp để kiểm tra và bắt nhập lại nếu không hợp lệ
        while (!isValid) {
            System.out.print("Nhập tuổi của bạn: ");

            // Kiểm tra xem dữ liệu nhập vào có phải là số nguyên hay không
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

                // Kiểm tra tiếp nếu là số nguyên nhưng <= 0 thì vẫn báo lỗi
                if (age > 0) {
                    isValid = true; // Nhập đúng, thoát vòng lặp
                } else {
                    System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0");
                }
            } else {
                // Trường hợp người dùng nhập chữ (chuỗi) hoặc ký tự khác
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0");
                scanner.next(); // Đọc và loại bỏ giá trị không hợp lệ trong bộ nhớ đệm
            }
        }

        // In kết quả sau khi nhập đúng tuổi
        System.out.printf("Tuổi của bạn là %d .\n", age);

        scanner.close();
    }
}