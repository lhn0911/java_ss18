package ss18;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("N phải là số nguyên dương. Vui lòng nhập lại!");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("Tần suất xuất hiện của các phần tử (sắp xếp tăng dần theo tần suất):");
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            System.out.println("Giá trị: " + entry.getKey() + " - Xuất hiện: " + entry.getValue() + " lần");
        }
    }
}
