package ss18;

import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static void main (String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("Laptop", 1000);
        map.put("SmartPhone", 2000);

        if(map.containsKey("Laptop")) {
            System.out.println("Có laptop giá: "+ map.get("Laptop"));

        }
        else {
            System.out.println("Không có sản phẩm");
        }
        if(map.containsValue(1000)){
            System.out.println("Có sản phẩm giá 1000");
        }
        else {
            System.out.println("Không có sản phẩm");
        }

    }
}
