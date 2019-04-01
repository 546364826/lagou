package com.zwj.dao;

import com.zwj.entity.Company;

import java.util.List;

public interface CompanyDao {
    boolean addCompany(Company company);

    boolean deleteCompany(String name);

    boolean updateCompany(Company company, String name);

    Company queryCompany(String name);

    List<Company> queryAllCompany();

    boolean isExist(String name);
}
