package com.wisdom.agriculture.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/8 0008 9:37
 * 描述：
 */
@Data
@Entity
public class Publish {

    /**
     * 发布动态的唯一编号
     */
    @Id
    @GeneratedValue
    private Integer publishId;

    /**
     * 与学号相对应
     */
    private Integer userNumber;

    /**
     * 发布的内容
     */
    private String publishContent;

    /**
     * 发表时间
     */
    private Date createTime;

    /**
     * 文件的名字
     */
    private String fileName;

    private String userName;

    private String userPhone;

    private String userEmail;
}
