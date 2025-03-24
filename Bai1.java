package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {
    public  static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("NguyenVanA",9);
        map.put("NguyenVanB",8);
        map.put("NguyenVanC",7);
        map.put("NguyenVanD",6);
        map.put("NguyenVanE",5);
        for(String name : map.keySet()) {
            System.out.println(name+" "+map.get(name));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sinh viên muốn tìm: ");
        String name = sc.nextLine();
        System.out.println("Điểm: "+map.get(name));

    }
}
