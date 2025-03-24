package ss18;

import java.util.TreeMap;

public class Bai4 {
    public static void main(String[] args) {
        TreeMap<String, Double> Employee = new TreeMap<String, Double>();
        Employee.put("NV001",70.0);
        Employee.put("NV003",60.0);
        Employee.put("NV002",50.0);
        Employee.put("NV004",50.0);
        Employee.put("NV005",50.0);
        for(String name : Employee.keySet()) {
            System.out.println(name+" "+Employee.get(name));
        }
        Employee.put("NV004",150.0);
        Employee.remove("NV001");
        System.out.println("Sau khi xóa");
        for(String name : Employee.keySet()) {
            System.out.println(name+" "+Employee.get(name));
        }
    }
}
