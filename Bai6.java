package ss18;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class Bai6 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> studentMap = new LinkedHashMap<>();
        studentMap.put("NguyenVanA", 9.0);
        studentMap.put("NguyenVanB", 8.0);
        studentMap.put("NguyenVanC", 7.0);
        studentMap.put("NguyenVanD", 6.0);
        studentMap.put("NguyenVanE", 5.0);
        studentMap.put("NguyenVanF", 3.5);
        studentMap.put("NguyenVanG", 4.5);
        studentMap.put("NguyenVanH", 5.5);
        studentMap.put("NguyenVanI", 6.5);
        studentMap.put("NguyenVanJ", 7.5);

        System.out.println("Danh sách học sinh ban đầu:");
        for(String key:  studentMap.keySet()){
            System.out.println(key + " - " + studentMap.get(key));
        }

        double totalScore = 0;
        for (double score : studentMap.values()) {
            totalScore += score;
        }
        double averageScore = totalScore / studentMap.size();
        System.out.println("Điểm trung bình của tất cả học sinh: " + averageScore);

        Iterator<Map.Entry<String, Double>> iterator = studentMap.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 5) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách học sinh sau khi xóa học sinh có điểm dưới 5:");
        for (Map.Entry<String, Double> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
