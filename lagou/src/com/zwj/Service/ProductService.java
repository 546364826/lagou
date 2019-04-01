package com.zwj.Service;

import com.zwj.entity.Product;

public interface ProductService {
    boolean AddProduct(Product product);

    Product queryProduct(String name);
}
