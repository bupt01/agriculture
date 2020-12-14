package com.wisdom.agriculture.controller;

import com.wisdom.agriculture.domain.PortData;
import com.wisdom.agriculture.enums.MyExceptionEnum;
import com.wisdom.agriculture.exception.MyException;
import com.wisdom.agriculture.repository.PortRepository;
import com.wisdom.agriculture.result.Result;
import com.wisdom.agriculture.service.PortService;
import com.wisdom.agriculture.service.impl.PortServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/15 0015 17:18
 * 描述：
 */
@RestController
@RequestMapping("port")
public class PortController {

    @Autowired
    private PortRepository portRepository;

    @Autowired
    private PortServiceImpl portService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(){
        List<PortData> portData = null;
        try {
             portData = portRepository.findAll();

        }catch (Exception e){
            throw new MyException(MyExceptionEnum.PORTISERRORLIST);
        }

        return new Result(true,2000,"查詢成功",portData);
    }


    @RequestMapping(value = "/max",method = RequestMethod.GET)
    public Result max(){
        PortData portData = null;
        try {
            portData = portRepository.findMaxId();

        }catch (Exception e){
            throw new MyException(MyExceptionEnum.PORTISERRORLIST);
        }

        return new Result(true,2000,"查詢成功",portData);
    }



}
