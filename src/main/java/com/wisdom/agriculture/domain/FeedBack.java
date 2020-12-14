package com.wisdom.agriculture.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 作者：ledendary-666
 * 创建时间：2019/3/29 0029 11:09
 * 描述：反馈信息
 */
@Data
@Entity
public class FeedBack {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String content;
}
