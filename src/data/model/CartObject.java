package data.model;

public class CartObject {
    final Product product;
    final int count;

    @Override
    public String toString() {
        return "{" + product + ", count: " + count + "} ";
    }

    public CartObject(Product product, int count) {
        this.product = product;
        this.count = count;
    }

}
