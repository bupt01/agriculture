package com.wisdom.agriculture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：王宇
 * 创建时间：2019/4/6 0006 11:07
 * 描述：
 */
@Controller
//@RequestMapping("syau/")
public class TestController {

    @RequestMapping("test1")
    public String test1(){
        return "test2";
    }

    @RequestMapping("interdata")
    public String interdata(){
        return "interdata";
    }

    @RequestMapping("sudata")
    public String sudata(){
        return "sudata";
    }

    @RequestMapping("apple")
    public String apple(){
        return "apple";
    }

    @RequestMapping("test2")
    public String test2() {
        return "index";
    }


    @RequestMapping("biocide")
    public String biocide() {
        return "biocide";
    }
    @RequestMapping("product")
    public String test3(){
        return "product";
    }

    @RequestMapping("aboutus")
    public String aboutus(){
        return "aboutus";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }


    @RequestMapping("place")
    public String place(){
        return "place";
    }


    @RequestMapping("information")
    public String information(){
        return "information";
    }


    @RequestMapping("apples")
    public String apples(){
        return "apple";
    }

    @RequestMapping("stra")
    public String stra(){
        return "stra";
    }

    @RequestMapping("applep")
    public String applep(){
        return "applep";
    }

    @RequestMapping("strap")
    public String strap(){
        return "strap";
    }

    @RequestMapping("tree")
    public String tree(){
        return "tree";
    }


    @RequestMapping("treep")
    public String treep(){
        return "treep";
    }
}


