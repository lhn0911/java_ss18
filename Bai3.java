package ss18;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> linkerHashMap = new LinkedHashMap<>();
        linkerHashMap.put("Tivi",1000);
        linkerHashMap.put("SmartPhone", 2000);
        linkerHashMap.put("Oto", 3000);
        for(String key : linkerHashMap.keySet()){
            System.out.println(key+":"+linkerHashMap.get(key));
        }
        System.out.println("Nhập tên sản phẩm muốn thay đổi giá: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá muốn thay đổi:");
        int price  = sc.nextInt();
        linkerHashMap.put(name,price);
        System.out.println("Giá sau khi thay đổi");
        for(String key : linkerHashMap.keySet()) {
            System.out.println(key+":"+linkerHashMap.get(key));
        }
        System.out.println("Nhập sản phẩm muốn xóa: ");
        sc.nextLine();
        String name1 = sc.nextLine();
        linkerHashMap.remove(name1);
        System.out.println("Sau khi xóa");
        for(String key : linkerHashMap.keySet()) {
            System.out.println(key+":"+linkerHashMap.get(key));
        }
    }
}
