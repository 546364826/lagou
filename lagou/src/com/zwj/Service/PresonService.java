package com.zwj.Service;

import com.zwj.entity.Preson;

import java.util.List;

public interface PresonService {
    boolean addPreson(Preson Preson);

    boolean deletePreson(String loginemail);

    boolean updatePreson(Preson preson, String loginemail);

    Preson queryPreson(String loginemail);

    List<Preson> queryAllPreson();

    boolean isExist(String loginemail);
}
