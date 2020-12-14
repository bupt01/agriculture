package com.wisdom.agriculture.controller;

import com.wisdom.agriculture.domain.News;
import com.wisdom.agriculture.result.PageResult;
import com.wisdom.agriculture.result.Result;
import com.wisdom.agriculture.service.impl.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：王宇
 * 创建时间：2019/4/10 0010 10:56
 * 描述：
 */
@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsServiceImpl newsService;

    @RequestMapping("/list")
    public Result newsList(){
        Page<News> top5 = newsService.findNewsTop5();

        return new Result(true, 2000, "查询新闻成功",
                new PageResult(top5.getTotalElements(),
                        top5.getContent()));
    }
}
