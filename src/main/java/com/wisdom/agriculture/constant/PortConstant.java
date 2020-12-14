package com.wisdom.agriculture.constant;

/**
 * create by ledendary-666
 * 2018/11/19 0019 18:26
 */
public interface PortConstant {
    //波特率
    Integer BOTELV =4800;
    /**每个字符发送数据等待时间*/
    Integer SLEEP_TIME=3000;
    /**设置自动更新时间*/
    String UPDATE_TIME ="30 * * * * ?";
    /**接收数据的等待时间*/
    Integer SLEEP_TIME_RED=5000;
    //设置获取最新数据的时间
    String GET_NEW_DATA ="30 * * * * ?";
    //查询所有数据的时间
    String GET_ALL_DATA ="30 * * * * ?";



}
