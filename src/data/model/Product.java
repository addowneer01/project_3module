package data.model;

public class Product {
    public final int id;
    public final String name;
    public final int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price + "$";
    }

}
