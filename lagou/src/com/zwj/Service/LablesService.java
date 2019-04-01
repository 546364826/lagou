package com.zwj.Service;

import com.zwj.entity.Lables;

import java.util.List;

public interface LablesService {
    boolean addLables(Lables Lables);
    boolean deleteLables(String lable);
    boolean updateLables(Lables lables, String lable);

    Lables queryLables(String lable);
    List<Lables> queryAllLables();
    boolean isExist(String lable);
}
