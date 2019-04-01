package com.zwj.dao;

import com.zwj.entity.Product;

public interface ProductDao {
    boolean AddProduct(Product product);

    Product queryProduct(String name);
}
