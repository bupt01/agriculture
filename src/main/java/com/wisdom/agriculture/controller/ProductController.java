package com.wisdom.agriculture.controller;

import com.wisdom.agriculture.DTO.ProductDTO;
import com.wisdom.agriculture.domain.ProductInfo;
import com.wisdom.agriculture.repository.ProductInfoRepository;
import com.wisdom.agriculture.result.PageResult;
import com.wisdom.agriculture.result.Result;
import com.wisdom.agriculture.service.impl.PortServiceImpl;
import com.wisdom.agriculture.service.impl.ProductInfoServiceImpl;
import com.wisdom.agriculture.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者：王宇
 * 创建时间：2019/3/29 0029 9:10
 * 描述：
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Autowired
    private PortServiceImpl portService;


    @Autowired
    private ProductInfoRepository productInfoRepository;

    /***
     * 查询商品的列表和温湿度并且返回分页列表
     *
     *
     * @return
     */
    /***
     *
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public Result productInfoAndPortData(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "4") Integer size) {
//        PageRequest request = PageRequest.of(page, size);
//        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);

        Page<ProductInfo> productInfos = productInfoService.productInfoAndPortData(page, size);
        return new Result(true, 2000, "查询成功",
                new PageResult(productInfos.getTotalElements(),
                        productInfos.getContent()));
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Result search(@RequestParam(value = "productName") String productName) {
        ProductInfo productInfo = productInfoRepository.findByProductName(productName);
        if (productInfo != null) {
            return new Result(true, 2000, "查询成功",
                    productInfo);
        } else
            return new Result(false, 4004, "无数据",
                    null);
    }

    @RequestMapping(value = "/{productId}")
    public Result list(@PathVariable String productId){

        ProductInfo productInfo = productInfoRepository.findById(productId).get();

        return ResultUtil.success(productInfo,"查询成功");

    }
}
