package com.wisdom.agriculture.util;

import com.wisdom.agriculture.result.Result;

/**
 * 作者：ledendary-666
 * 创建时间：2019/3/29 0029 9:06
 * 描述：
 */
public class ResultUtil {

    /**
     * 返回成功的结果
     * @param object
     * @param message
     */
    public static Result success(Object object, String message){
        Result result = new Result();
        result.setCode(200);
        result.setData(object);
        result.setFlag(true);
        result.setMessage(message);
        return result;
    }

    public static Result error(String message){
        Result result = new Result();
        result.setCode(5000);
        result.setFlag(false);
        result.setMessage(message);
        return result;
    }
}
