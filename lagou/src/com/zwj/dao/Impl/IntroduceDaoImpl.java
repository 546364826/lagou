package com.zwj.dao.Impl;

import com.zwj.dao.IntroduceDao;
import com.zwj.entity.Introduce;
import com.zwj.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IntroduceDaoImpl implements IntroduceDao {
    @Override
    public boolean AddIntroduce(Introduce introduce) {
        String sql = "insert into Introduce(culture) values (?)";

        Object[] os = {introduce.getCulture()};

        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public Introduce queryIntroduce(String culture) {
        String sql = "select culture from Introduce where name=?";
        Object[] os = {culture};
        Introduce introduce = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String cultures =  rs.getString("culture");
                introduce = new Introduce(cultures);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return introduce;
    }
}
