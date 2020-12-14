package com.wisdom.agriculture.service.impl;


import com.wisdom.agriculture.DTO.ProductDTO;
import com.wisdom.agriculture.domain.PortData;
import com.wisdom.agriculture.domain.ProductInfo;
import com.wisdom.agriculture.repository.PortRepository;
import com.wisdom.agriculture.repository.ProductInfoRepository;
import com.wisdom.agriculture.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * create by ledendary-666
 * 2018/10/22 0022 9:06
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private PortServiceImpl portService;

    @Autowired
    private PortRepository portRepository;

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo addProduct(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }

    @Override
    public boolean deleteById(String productById) {
        productInfoRepository.deleteById(productById);
        return true;
    }

    @Override
    public ProductInfo updateProduct(ProductInfo productInfo) {


        return productInfoRepository.save(productInfo);
    }

    @Override
    public ProductInfo finOneById(String productId) {
        return productInfoRepository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> ProductList() {
        return productInfoRepository.findAll();
    }

    @Override
    public List<ProductInfo> findAllLike(String productId, String productName, Integer userNumber) {
        return productInfoRepository.finAllLike(productId, productName, userNumber);
    }

    @Override
    @Transactional
    public void deleteAll(List<String> ProductIds) {
        for (String productId : ProductIds) {
            productInfoRepository.deleteById(productId);
        }
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return null;
    }

    @Override
    public ProductInfo productUp(String productId) {
        return null;
    }

    @Override
    public ProductInfo productOff(String productId) {
        return null;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return null;
    }

    @Override
    public Page<ProductInfo> productInfoAndPortData(int page, int size) {

        PageRequest pageRequest = PageRequest.of(page - 1, size);
//        Page<ProductInfo> productInfoPage = productInfoRepository.findAll(pageRequest);
        Page<ProductInfo> productInfoPage = productInfoRepository.findByProductStatus(0, pageRequest);

        for (ProductInfo productInfo : productInfoPage.getContent()) {
            //设置数据
//                PortData data = portService.findById(productInfo.getProductType());
            PortData data = portRepository.findMaxId();
            productInfo.setPortData(data);
        }
        return productInfoPage;
    }


}
