package com.wisdom.agriculture.service.impl;

import com.wisdom.agriculture.domain.FeedBack;
import com.wisdom.agriculture.repository.FeedBackRepository;
import com.wisdom.agriculture.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：ledendary-666
 * 创建时间：2019/3/29 0029 11:15
 * 描述：
 */
@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    private FeedBackRepository feedBackRepository;

    @Override
    public FeedBack save(FeedBack feedBack) {
        FeedBack save = feedBackRepository.save(feedBack);
        return save;
    }
}
