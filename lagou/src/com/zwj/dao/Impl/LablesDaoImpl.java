package com.zwj.dao.Impl;

import com.zwj.dao.LablesDao;
import com.zwj.entity.Lables;
import com.zwj.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LablesDaoImpl implements LablesDao {
    @Override
    public boolean addLables(Lables  lable) {
        String sql = "insert into lables (lable) values (?)";
        Object[] os = {lable.getLable()};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean deleteLables(String lable) {
        String sql = "delete from lables where name =?";
        Object[] os = {lable};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean updateLables(Lables lables,String lable) {
        String sql = "update lables set lable=? where lable=?";
        Object[] os = {lables.getLable(), lable};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public Lables queryLables(String lable) {
        String sql = "select lable from lables where lable=?";
        Object[] os = {lable};
        Lables Lables = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String lables = rs.getString("lable");
                Lables = new Lables(lable);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lables;
    }

    @Override
    public List<Lables> queryAllLables() {
            String sql = "select lable from lables";
            Object[] os = null;
            List<Lables> LablesList = new ArrayList<>();
            try {
                ResultSet rs = DBUtil.executeQuery(sql, os);
                while (rs.next()) {
                    String lable = rs.getString("lable");
                    Lables lables = new Lables(lable);
                    LablesList.add(lables);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return LablesList;
        }

    @Override
    public boolean isExist(String lable) {
        boolean isExist = false;
        Lables lables = queryLables(lable);
        isExist = (lables == null) ? false : true;
        return isExist;
    }
}
