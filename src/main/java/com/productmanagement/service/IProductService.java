package com.productmanagement.service;

import com.productmanagement.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(int id);
    public void save(Product product);
    public void update(int id, Product product);
    public void remove(int id);
    public void search(String name);
}
