package com.zwj.Service.Impl;

import com.zwj.Service.LablesService;
import com.zwj.dao.Impl.LablesDaoImpl;
import com.zwj.entity.Lables;

import java.util.List;

public class LablesServiceImpl implements LablesService {
    LablesDaoImpl LablesDao=new LablesDaoImpl();


    public boolean addLables(Lables lable) {
        if (LablesDao.isExist(lable.getLable())) {
            System.out.println("此人已经存在，不能重复添加");
            return false;
        }
        return LablesDao.addLables(lable);
    }


    public boolean deleteLables(String lable) {
        if (!LablesDao.isExist(lable)) {
            System.out.println("查无此人");
            return false;
        }
        return LablesDao.deleteLables(lable);
    }


    public boolean updateLables(Lables lables, String lable) {
        if (!LablesDao.isExist(lable )) {
            System.out.println("查无此人");
            return false;
        }
        return LablesDao.updateLables(lables, lable);
    }


    public Lables queryLables(String lable) {
        return LablesDao.queryLables(lable);
    }


    public List<Lables> queryAllLables() {
        return LablesDao.queryAllLables();
    }


    public boolean isExist(String lable) {
        return LablesDao.isExist(lable);
    }
}

