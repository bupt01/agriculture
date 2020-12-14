package com.wisdom.agriculture.service.impl;

import com.wisdom.agriculture.domain.News;
import com.wisdom.agriculture.repository.NewsRepository;
import com.wisdom.agriculture.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/10 0010 10:48
 * 描述：
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;
    @Override
    public Page<News> findNewsTop5() {
        PageRequest request = PageRequest.of(0,6);
        Page<News> news = newsRepository.findAll(request);
        return news;
    }
}
