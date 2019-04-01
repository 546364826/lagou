package com.zwj.dao.Impl;

import com.zwj.dao.CompanyDao;
import com.zwj.entity.Company;
import com.zwj.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CompanyDaoImpl implements CompanyDao {
    @Override
    public boolean addCompany(Company company) {
        String sql = "insert into company(fullname,name,website,chinacity,Industry,csize,phase,temptation) values (?,?,?,?,?,?,?,?)";
        Object[] os = {company.getFullname(),company.getName(), company.getWebsite(),company.getChinacity(),company.getIndustry(),company.getCsize(),company.getPhase(),company.getTemptation()};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean deleteCompany(String name) {
        String sql = "delete from company where name =?";
        Object[] os = {name};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean updateCompany(Company company, String name) {
        String sql = "update Company set fullname=?,name=?,website=?,chinacity=?,Industry=?,csize=?,phase=?,temptation=? where name=?";
        Object[] os = {company.getFullname(),company.getName(), company.getWebsite(),
                company.getChinacity(),company.getIndustry(),company.getCsize(),
        company.getPhase(),company.getTemptation(),name};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public Company queryCompany(String name) {
        String sql = "select fullname,name,website,hinacity,Industry,csize,phase,temptation from Company where name=?";
        Object[] os = {name};
        Company company = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String fullname = rs.getString("fullname");
                String names = rs.getString("name");
                String website = rs.getString("website");
                String chinacity = rs.getString("chinacity");
                String Industry = rs.getString("Industry");
                String csize = rs.getString("csize");
                String phase = rs.getString("phase");
                String temptation = rs.getString("temptation");
                company = new Company(fullname, names, website, chinacity, Industry, csize, phase, temptation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return company;
    }

    @Override
    public List<Company> queryAllCompany() {
        String sql = "select fullname,name,website,chinacity,Industry,csize,phase,temptation from Company";
        Object[] os = null;
        List<Company> CompanyList = new ArrayList<Company>();
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String names = rs.getString("name");
                String website = rs.getString("website");
                String chinacity = rs.getString("chinacity");
                String Industry = rs.getString("Industry");
                String csize = rs.getString("csize");
                String phase = rs.getString("phase");
                String temptation = rs.getString("temptation");
                Company company = new Company(fullname, names, website, chinacity, Industry, csize, phase, temptation);
                CompanyList.add(company);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CompanyList;
    }

    @Override
    public boolean isExist(String name) {
        boolean isExist = false;
        Company Company = queryCompany(name);
        isExist = (Company == null) ? false : true;
        return isExist;
    }
}
