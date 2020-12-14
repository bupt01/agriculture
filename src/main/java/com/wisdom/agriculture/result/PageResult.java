package com.wisdom.agriculture.result;

import lombok.Data;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/29 0029 9:13
 * 描述：
 */
@Data
public class PageResult<T> {

    private Long total;
    private List<T> rows;

    public PageResult(){

    }

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}

