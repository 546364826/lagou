package com.zwj.Service.Impl;

import com.zwj.Service.IntroduceService;
import com.zwj.dao.Impl.IntroduceDaoImpl;
import com.zwj.entity.Introduce;

public class IntroduceServiceImpl implements IntroduceService {
    IntroduceDaoImpl IntroduceDao = new IntroduceDaoImpl();
    @Override
    public boolean AddIntroduce(Introduce introduce) {
        return IntroduceDao.AddIntroduce(introduce);
    }

    @Override
    public Introduce queryIntroduce(String culture) {
        return IntroduceDao.queryIntroduce(culture);
    }
}
