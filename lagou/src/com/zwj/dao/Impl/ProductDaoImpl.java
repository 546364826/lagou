package com.zwj.dao.Impl;

import com.zwj.dao.ProductDao;
import com.zwj.entity.Product;
import com.zwj.util.DBUtil;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao {


    @Override
    public boolean AddProduct(Product product) {
        String sql = "insert into product(posters,name,address,Introduction) values (?,?,?,?)";

        Object[] os = {product.getPasters(),product.getName(),product.getAddress(),product.getIntroduction()};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public Product queryProduct(String name) {
        String sql = "select posters,name,address,Introduction from product where name=?";
        Object[] os = {name};
        Product product = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String posters =  rs.getString("posters");
                String names = rs.getString("name");
                String address = rs.getString("address");
                String Introduction = rs.getString("Introduction");

                product = new Product(posters,names, address, Introduction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
