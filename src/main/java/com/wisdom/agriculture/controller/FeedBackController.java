package com.wisdom.agriculture.controller;

import com.wisdom.agriculture.domain.FeedBack;
import com.wisdom.agriculture.result.Result;
import com.wisdom.agriculture.service.impl.FeedBackServiceImpl;
import com.wisdom.agriculture.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：ledendary-666
 * 创建时间：2019/3/29 0029 12:00
 * 描述：
 */
@RestController
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    private FeedBackServiceImpl feedBackService;

    /****
     *
     * 返回给前台的格式：
     * {
     *     "flag": true,
     *     "code": 200,
     *     "message": "发布成功",
     *     "data": {
     *         "id": "32",
     *         "name": "ledendary-666",
     *         "phone": "145141",
     *         "email": "41515@qq.com",
     *         "content": "postman"
     *     }
     * }
     * @param feedBack
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Result list(FeedBack feedBack) {
        FeedBack feedBack1 = null;
        try {
            feedBack1 = feedBackService.save(feedBack);
        } catch (Exception e) {
            return ResultUtil.error("发布失败！");
        }
        return ResultUtil.success(feedBack1, "发布成功");
    }
}
