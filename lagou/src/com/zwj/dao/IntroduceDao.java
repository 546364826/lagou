package com.zwj.dao;

import com.zwj.entity.Introduce;

public interface IntroduceDao {
    boolean AddIntroduce(Introduce introduce);

    Introduce queryIntroduce(String culture);
}
