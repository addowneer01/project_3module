package data.source.catalog;

import data.model.Product;

import java.util.ArrayList;
import java.util.Collections;

public class catalogTest extends catalogDataSource{

    public catalogTest(){
        Collections.addAll(products,
                new Product(1,"phone",1000),
                new Product(2,"watch",500),
                new Product(3,"pc",10000)
        );
    }

    @Override
    public ArrayList<Product> getProducts() {
        return products;
    }
}
