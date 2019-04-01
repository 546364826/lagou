package com.zwj.dao;

import com.zwj.entity.Lables;

import java.util.List;

public interface LablesDao {
    boolean addLables(Lables lable);
    boolean deleteLables(String lable);
    boolean updateLables(Lables lables,String lable);

    Lables queryLables(String lable);
    List<Lables> queryAllLables();
    boolean isExist(String lable);
}
