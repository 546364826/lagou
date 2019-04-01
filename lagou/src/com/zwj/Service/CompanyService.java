package com.zwj.Service;

import com.zwj.entity.Company;

import java.util.List;

public interface CompanyService {
    boolean addCompany(Company Company);

    boolean deleteCompany(String name);

    boolean updateCompany(Company Company, String name);

    Company queryCompany(String name);

    List<Company> queryAllCompany();

    boolean isExist(String name);
}
