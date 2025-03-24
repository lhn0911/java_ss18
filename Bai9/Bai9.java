package ss18.Bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai9 {
    private static final Map<Integer, Product> productMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Quản lý kho hàng =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Cập nhật sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tính tổng giá trị kho hàng");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    calculateTotalValue();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Nhập ID sản phẩm: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (productMap.containsKey(id)) {
            System.out.println("Sản phẩm có ID này đã tồn tại!");
            return;
        }

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        double price;
        do {
            System.out.print("Nhập giá sản phẩm: ");
            price = scanner.nextDouble();
            if (price < 0) System.out.println("Giá không hợp lệ! Nhập lại.");
        } while (price < 0);

        int quantity;
        do {
            System.out.print("Nhập số lượng sản phẩm: ");
            quantity = scanner.nextInt();
            if (quantity < 0) System.out.println("Số lượng không hợp lệ! Nhập lại.");
        } while (quantity < 0);

        productMap.put(id, new Product(id, name, price, quantity));
        System.out.println("Thêm sản phẩm thành công!");
    }

    private static void updateProduct() {
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = scanner.nextInt();

        if (!productMap.containsKey(id)) {
            System.out.println("Sản phẩm không tồn tại!");
            return;
        }

        Product product = productMap.get(id);

        System.out.println("1. Cập nhật giá sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        System.out.print("Chọn tùy chọn: ");
        int option = scanner.nextInt();

        if (option == 1) {
            double newPrice;
            do {
                System.out.print("Nhập giá mới: ");
                newPrice = scanner.nextDouble();
                if (newPrice < 0) System.out.println("Giá không hợp lệ! Nhập lại.");
            } while (newPrice < 0);
            product.price = newPrice;
        } else if (option == 2) {
            int newQuantity;
            do {
                System.out.print("Nhập số lượng mới: ");
                newQuantity = scanner.nextInt();
                if (newQuantity < 0) System.out.println("Số lượng không hợp lệ! Nhập lại.");
            } while (newQuantity < 0);
            product.quantity = newQuantity;
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        System.out.println("Cập nhật sản phẩm thành công!");
    }

    private static void removeProduct() {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = scanner.nextInt();

        if (productMap.remove(id) != null) {
            System.out.println("Xóa sản phẩm thành công!");
        } else {
            System.out.println("Sản phẩm không tồn tại!");
        }
    }

    private static void displayProducts() {
        if (productMap.isEmpty()) {
            System.out.println("Kho hàng trống!");
            return;
        }

        System.out.println("Danh sách sản phẩm trong kho:");
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }

    private static void calculateTotalValue() {
        double totalValue = productMap.values().stream().mapToDouble(Product::getTotalValue).sum();
        System.out.println("Tổng giá trị kho hàng: " + totalValue);
    }
}
