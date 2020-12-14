package com.wisdom.agriculture.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/10 0010 10:40
 * 描述：
 */
@Data
@Entity
public class News {

    @Id
    @GeneratedValue
    private Integer newsId;

    private String newsTitle;

    private String newsHref;

    private String newsTime;

    private Integer newsType;

    private String newsImg;

}
