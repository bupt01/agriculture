package com.wisdom.agriculture.DTO;

import com.wisdom.agriculture.domain.PortData;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者：王宇
 * 创建时间：2019/3/29 0029 9:27
 * 描述：
 */
@Data
public class ProductDTO {
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

    private PortData portData;
}
