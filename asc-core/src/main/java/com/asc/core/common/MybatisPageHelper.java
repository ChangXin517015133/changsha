package com.asc.core.common;

import com.asc.common.PageRequest;
import com.asc.common.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.util.ReflectionUtils;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Mybatis 分页查询助手
 * @author changxin
 * @date 2019-10-16
 */
public class MybatisPageHelper {
    public static final String findPage = "findPage";

    /**
     * 分页查询，约定查询方法名为"findPage"
     * @param pageRequest 分页请求
     * @param mapper dao对象，mybatis的mapper
     * @return
     */
    public static PageResult findPage(PageRequest pageRequest,Object mapper){
        return findPage(pageRequest,mapper,findPage);
    }

    /**
     * 调用分页插件进行分页查询
     * @param pageRequest 分页请求
     * @param mapper dao对象，mybatis的mapper
     * @param queryMethodName 要分页的查询方法名
     * @param args 方法参数
     * @return
     */
    public static PageResult findPage(PageRequest pageRequest,Object mapper,String queryMethodName,Object... args){
        //设置分页参数
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        try{
            //利用反射调用查询方法
            Method method = ReflectionUtils.findMethod(mapper.getClass(), queryMethodName);
            Object result = ReflectionUtils.invokeMethod(method,queryMethodName,args);
            return getPageResult(pageRequest,new PageInfo((List) result));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param pageInfo
     * @return
     */
    private static PageResult getPageResult(PageRequest pageRequest,PageInfo<T> pageInfo){
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }

}
