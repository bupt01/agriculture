package com.wisdom.agriculture.service;

import com.wisdom.agriculture.domain.News;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/10 0010 10:46
 * 描述：
 */
public interface NewsService {

    /***
     * 查询前5条新闻
     * @return
     */
    public Page<News> findNewsTop5();
}
