package com.wisdom.agriculture.repository;

import com.wisdom.agriculture.domain.Publish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.Assert.*;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/8 0008 9:41
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PublishRepositoryTest {

    @Autowired
    private PublishRepository publishRepository;

    @Test
    public void save(){
        Publish publish = new Publish();
        publish.setUserName("小黑");
        publish.setUserEmail("12142@163.com");
        publish.setUserPhone("2132343");
        publish.setPublishContent("大家好！");
        Publish save = publishRepository.save(publish);
            Assert.notNull(save);
    }
}