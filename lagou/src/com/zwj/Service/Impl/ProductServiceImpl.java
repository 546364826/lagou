package com.zwj.Service.Impl;

import com.zwj.Service.ProductService;
import com.zwj.dao.Impl.ProductDaoImpl;
import com.zwj.entity.Product;

public class ProductServiceImpl implements ProductService {
    ProductDaoImpl productDao = new ProductDaoImpl();
    @Override
    public boolean AddProduct(Product product) {
        return productDao.AddProduct(product);
    }

    @Override
    public Product queryProduct(String name) {
        return productDao.queryProduct(name);
    }
}
