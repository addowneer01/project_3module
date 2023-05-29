package data.source.catalog;

import data.model.Product;

import java.util.ArrayList;

public abstract class catalogDataSource {
    protected ArrayList<Product> products = new ArrayList<>();
    public abstract ArrayList<Product> getProducts();
}
