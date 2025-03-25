package ss18.Bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
            if (n < 1 || n > 3999) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
            }
        } while (n < 1 || n > 3999);

        String romanNumber = RomanNumber.convertToRoman(n);
        System.out.println("Số La Mã tương ứng: " + romanNumber);
    }
}
