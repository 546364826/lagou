package com.zwj.Service;

import com.zwj.entity.Introduce;

public interface IntroduceService {
    boolean AddIntroduce(Introduce introduce);

    Introduce queryIntroduce(String culture);
}
