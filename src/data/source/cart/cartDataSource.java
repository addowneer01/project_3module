package data.source.cart;

import data.model.CartObject;

import java.util.ArrayList;

public class cartDataSource {
    private ArrayList<CartObject> items;

    public cartDataSource() {
        this.items = new ArrayList<>();
    }
    public void add(CartObject item){
        items.add(item);
    }
    public void remove(int id){
        items.remove(id-1);
    }
    public ArrayList<CartObject> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder(" ");
        for (CartObject item: items){
            x.append(item);
        }
        return x.toString();
    }
}
