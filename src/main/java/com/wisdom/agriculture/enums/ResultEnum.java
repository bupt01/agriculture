package com.wisdom.agriculture.enums;

import lombok.Getter;

/**
 * create by wangyu
 * 2018/11/19 0019 16:40
 */
@Getter
public enum ResultEnum {
    NUMBER_PASSWORD_ERROR(10,"用户名或密码错误！"),
    NOT_LOGIN(11,"您还没有登录，请先登录"),
    DELETE_PRODUCT_SUCCESS(12,"删除商品成功"),
    SAVE_SUCCESS(13,"保存成功"),
    PUBLIC_SUCCESS(14,"发布公告成功"),
    MODIFIED_PASSWORD(15,"修改密码成功,请重新登录！"),
    MODIFIED_PASSWORD_ERROR(16,"密码修改失败"),
    SUGGEST_SUCCESS(17,"意见反馈成功"),
    SUGGEST_ERROR(17,"意见反馈失败"),
    LOGIN_SUCCESS(18,"登录成功，欢迎您"),
    SAVE_USER_SUCCESS(19,"保存用户信息成功"),
    LOGIN_OUT(20,"登出成功"),
    PUBLISH_ERROR(21,"反馈信息失败！"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
