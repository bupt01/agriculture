package com.wisdom.agriculture.exception;


import com.wisdom.agriculture.enums.MyExceptionEnum;

/**
 * create by wangyu
 * 2018/10/19 0019 18:35
 */
public class MyException extends RuntimeException {


    private Integer code;

    public MyException(MyExceptionEnum myExceptionEnum) {
        super(myExceptionEnum.getMessage());
    }

}
