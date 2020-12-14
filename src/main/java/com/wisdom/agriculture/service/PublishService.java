package com.wisdom.agriculture.service;

import com.wisdom.agriculture.domain.Publish;
import com.wisdom.agriculture.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/8 0008 9:46
 * 描述：
 */
public interface PublishService {


    public Publish save(Publish publish);

}
