package com.wisdom.agriculture.service.impl;

import com.wisdom.agriculture.domain.Publish;
import com.wisdom.agriculture.repository.PublishRepository;
import com.wisdom.agriculture.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/8 0008 9:48
 * 描述：
 */
@Service
public class PublishServiceImpl implements PublishService {

    @Autowired
    private PublishRepository publishRepository;

    @Override
    public Publish save(Publish publish) {
        return publishRepository.save(publish);
    }
}
