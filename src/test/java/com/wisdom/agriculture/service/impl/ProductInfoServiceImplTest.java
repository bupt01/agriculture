package com.wisdom.agriculture.service.impl;

import com.wisdom.agriculture.domain.ProductInfo;
import com.wisdom.agriculture.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2019/4/19 0019 18:29
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;
    @Test
    public void productInfoAndPortData() {
        Page<ProductInfo> productInfoPage = productInfoService.productInfoAndPortData(1, 2);
        Assert.assertNotNull(productInfoPage.getTotalPages());
    }
}