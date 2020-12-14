package com.wisdom.agriculture.service.impl;

import com.wisdom.agriculture.domain.FeedBack;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2019/3/29 0029 11:21
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FeedBackServiceImplTest {

    @Autowired
    private FeedBackServiceImpl feedBackService;
    @Test
    public void save() {
        FeedBack feedBack = new FeedBack();
        feedBack.setId("1");
        feedBack.setContent("这是一个测试");
        feedBack.setEmail("152541@qq.com");
        feedBack.setName("小黑");
        feedBack.setPhone("125414158");
        FeedBack save = feedBackService.save(feedBack);
        Assert.assertNotNull(save);
    }
}