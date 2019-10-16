package com.asc.common;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * 分页返回结果
 * @author changxin
 * @date 2019-10-16
 */
@Data
public class PageResult {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 分页数据
     */
    private List<T> content;
}
