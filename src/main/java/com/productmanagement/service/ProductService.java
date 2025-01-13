package com.productmanagement.service;

import com.productmanagement.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iPhone 12", 799, "New iPhone 12", "Apple"));
        products.put(2, new Product(2, "Galaxy S21", 699, "New Galaxy S21", "Samsung"));
        products.put(3, new Product(3, "Xperia 1", 599, "New Xperia 1", "Sony"));
        products.put(4, new Product(4, "Mi 11", 499, "New Mi 11", "Xiaomi"));
        products.put(5, new Product(5, "Mate 40", 399, "New Mate 40", "Huawei"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void search(String name) {
        for (Product product : products.values()) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }
}
