package com.wisdom.agriculture.service.impl;

import com.wisdom.agriculture.domain.News;
import com.wisdom.agriculture.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.*;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/10 0010 10:51
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class NewsServiceImplTest {

    @Autowired
    private NewsServiceImpl newsService;
    @Test
    public void findNewsTop5() {
        Page<News> news = newsService.findNewsTop5();
        Assert.notNull(news);
    }
}