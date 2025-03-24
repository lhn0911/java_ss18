package ss18;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Map<String, Double> productMap = new HashMap<>();
        productMap.put("Laptop", 1000.0);
        productMap.put("Mobile", 700.0);
        productMap.put("Tablet", 800.0);
        productMap.put("PC", 5000.0);
        productMap.put("Monitor", 1200.0);
        List<Map.Entry<String, Double>> filteredList = new ArrayList<>();
        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500) {
                filteredList.add(entry);
            }
        }
        filteredList.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Double> entry : filteredList) {
            System.out.println("Tên sản phẩm: " + entry.getKey() + " - Giá: " + entry.getValue());
        }
    }
}
