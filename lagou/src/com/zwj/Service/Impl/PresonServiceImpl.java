package com.zwj.Service.Impl;

import com.zwj.Service.PresonService;
import com.zwj.dao.Impl.PresonDaoImpl;
import com.zwj.entity.Preson;

import java.util.List;

public class PresonServiceImpl implements PresonService {
    PresonDaoImpl presonDao = new PresonDaoImpl();
    public boolean addPreson(Preson preson) {
        if (presonDao.isExist(preson.getLoginemail())) {
            System.out.println("此人已经存在，不能重复添加");
            return false;
        }
        return presonDao.addPreson(preson);
    }

    public boolean deletePreson(String loginemail) {
        if (!presonDao.isExist(loginemail)) {
            System.out.println("查无此人");
            return false;
        }
        return presonDao.deletePreson(loginemail);
    }

    public boolean updatePreson(Preson preson, String loginemail) {
        if (!presonDao.isExist(loginemail)) {
            System.out.println("查无此人");
            return false;
        }
        return presonDao.updatePreson(preson,loginemail);
    }
    public Preson queryPreson(String loginemail) {
        return presonDao.queryPreson(loginemail);
    }


    public List<Preson> queryAllPreson() {
        return presonDao.queryAllPreson();
    }

    public boolean isExist(String loginemail) {
        return presonDao.isExist(loginemail);
    }
}
