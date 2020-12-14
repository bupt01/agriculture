package com.wisdom.agriculture.controller;

import com.wisdom.agriculture.domain.PortData;
import com.wisdom.agriculture.domain.ProductInfo;
import com.wisdom.agriculture.enums.MyExceptionEnum;
import com.wisdom.agriculture.exception.MyException;
import com.wisdom.agriculture.repository.PortRepository;
import com.wisdom.agriculture.service.impl.PortServiceImpl;
import com.wisdom.agriculture.service.impl.ProductInfoServiceImpl;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/15 0015 18:16
 * 描述：
 */
@RestController
public class ExcelController {

    @Autowired
    private ProductInfoServiceImpl productInfoService;
    @Autowired
    private PortServiceImpl portService;

    @Autowired
    private PortRepository portRepository;

    @RequestMapping("/productExcel.action")
    public void productExcel(HttpServletResponse response) {
//        poi主包
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("商品信息表");

//        商品列表
        List<ProductInfo> productInfoList = productInfoService.ProductList();

        List<PortData> portDataList = portRepository.findAll();
//        设置要导出文件的名字
        String fileName = "product" + ".xls";

//        设置数据行，并设置单元格式数据
        int rowNum = 1;
//        headers表示第一行的表头
        String[] headers = {"创建时间", "温度", "湿度", "光照强度"};

//        在excel表中添加表头
        HSSFRow row = sheet.createRow(0);//在0行创建表头吧

//        遍历表头并设置表头
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            /**
             * ????
             */
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

//        把表中查到的数据放入到对应的列
        for (PortData productInfo : portDataList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(productInfo.getCreateTime());
            row1.createCell(1).setCellValue(productInfo.getTemperature());
            row1.createCell(2).setCellValue(productInfo.getHumidity());
            row1.createCell(3).setCellValue(productInfo.getLightIntensity());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        try {
            response.flushBuffer();
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            throw new MyException(MyExceptionEnum.IOEXCEPTION);
        }
//        return "redirect:/admin/list.action";
    }


    @RequestMapping("/portExcel.action")
    public void portExcel(HttpServletResponse response) {
//        poi主包
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("大棚实时数据信息表");

//        商品列表
//        List<ProductInfo> productInfoList = productInfoService.ProductList();
        List<PortData> portData = portRepository.findAll();
//        设置要导出文件的名字
        String fileName = "portData" + ".xls";

//        设置数据行，并设置单元格式数据
        int rowNum = 1;
//        headers表示第一行的表头
        String[] headers = {"温度", "湿度", "光照强度", "检测时间"};

//        在excel表中添加表头
        HSSFRow row = sheet.createRow(0);//在0行创建表头吧

//        遍历表头并设置表头
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            /**
             * ????
             */
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

//        把表中查到的数据放入到对应的列
        for (PortData productInfo : portData) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(productInfo.getTemperature());
            row1.createCell(1).setCellValue(productInfo.getHumidity());
            row1.createCell(2).setCellValue(productInfo.getLightIntensity());
            row1.createCell(3).setCellValue(String.valueOf(productInfo.getCreateTime()));
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        try {
            response.flushBuffer();
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            throw new MyException(MyExceptionEnum.IOEXCEPTION);
        }
//        return "redirect:/admin/list.action";
    }
}

