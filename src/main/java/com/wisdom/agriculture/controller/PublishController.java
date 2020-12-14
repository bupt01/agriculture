package com.wisdom.agriculture.controller;

import com.wisdom.agriculture.domain.FeedBack;
import com.wisdom.agriculture.domain.Publish;
import com.wisdom.agriculture.result.Result;
import com.wisdom.agriculture.service.impl.PublishServiceImpl;
import com.wisdom.agriculture.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：王宇
 * 创建时间：2019/4/8 0008 9:50
 * 描述：
 */
@Controller
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    private PublishServiceImpl publishService;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String list(Publish publish) {
        Publish publish1 = null;
        try {
            publish = publishService.save(publish);
        } catch (Exception e) {
            return "redirect:http://localhost:9000/aboutus";

        }
//        return ResultUtil.success(publish, "发布成功");
        return "redirect:http://localhost:9000/aboutus";
    }
}
