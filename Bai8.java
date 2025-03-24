package ss18;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số nguyên dương : ");
            n = scanner.nextInt();
            if (n < 1 || n > 3999) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
            }
        } while (n < 1 || n > 3999);

        String romanNumber = convertToRoman(n);
        System.out.println("Số La Mã tương ứng: " + romanNumber);
    }

    public static String convertToRoman(int num) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder roman = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                roman.append(entry.getValue());
                num -= entry.getKey();
            }
        }
        return roman.toString();
    }
}
