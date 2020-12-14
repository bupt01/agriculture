package com.wisdom.agriculture.result;

import lombok.Data;

/**
 * 作者：王宇
 * 创建时间：2019/3/29 0029 9:04
 * 描述：
 */
@Data
public class Result<T> {

    private boolean flag;//是否成功
    private Integer code;// 返回码
    private String message;//返回信息
    private Object data;// 返回数据


    public Result() {
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
