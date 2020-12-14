package com.wisdom.agriculture.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者：ledendary-666
 * 创建时间：2019/3/29 0029 8:29
 * 描述：
 */
@Entity
@Data
public class ProductInfo {
    /**商品的id*/
    @Id
    private String productId;

    /**商品的名称*/
    private String productName;

    /**商品的单价*/
    private BigDecimal productPrice;

    /**商品的库存*/
    private Integer productNum;

    /**商品的描述*/
    private String productDescription;

    /**商品的图片*/
    private String productImg;

    /**类目编号*/
    private Integer productType;

    /**商品的状态 0正常 1下架*/
    private Integer productStatus;

    private Date createTime;

    private Integer portId;

    /**
     * 使用该注解忽视数据库中没有的字段
     */
    @Transient
    private PortData portData;
}

