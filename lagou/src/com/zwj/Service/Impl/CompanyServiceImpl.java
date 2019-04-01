package com.zwj.Service.Impl;

import com.zwj.Service.CompanyService;
import com.zwj.dao.Impl.CompanyDaoImpl;
import com.zwj.entity.Company;
import java.util.List;

public class CompanyServiceImpl implements CompanyService {
    CompanyDaoImpl companyDao = new CompanyDaoImpl();
    public boolean addCompany(Company company) {
        if (companyDao.isExist(company.getName())) {
            System.out.println("此人已经存在，不能重复添加");
            return false;
        }
        return companyDao.addCompany(company);
    }

    public boolean deleteCompany(String name) {
        if (!companyDao.isExist(name)) {
            System.out.println("查无此人");
            return false;
        }
        return companyDao.deleteCompany(name);
    }

    public boolean updateCompany(Company company, String name) {
        if (!companyDao.isExist(name)) {
            System.out.println("查无此人");
            return false;
        }
        return companyDao.updateCompany(company,name);
    }
    public Company queryCompany(String name) {
        return companyDao.queryCompany(name);
    }


    public List<Company> queryAllCompany() {
        return companyDao.queryAllCompany();
    }

    public boolean isExist(String name) {
        return companyDao.isExist(name);
    }
}
