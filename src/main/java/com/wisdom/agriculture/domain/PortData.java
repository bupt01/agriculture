package com.wisdom.agriculture.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
public class PortData {

    /**串口的id*/
    @Id
    @GeneratedValue
    private Integer portId;

    /**温度*/
    private Double temperature;

    /**湿度*/
    private Double humidity;

    /**光照强度*/
    private Double lightIntensity;

    /**插入数据库的时间*/
    private Date createTime;

    /**该水果所属大棚*/
    private Integer portType;
    }
