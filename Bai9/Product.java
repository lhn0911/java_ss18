package ss18.Bai9;

public class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Giá: " + price + ", Số lượng: " + quantity;
    }
}
