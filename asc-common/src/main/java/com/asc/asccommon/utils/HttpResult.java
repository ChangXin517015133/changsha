package com.asc.asccommon.utils;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * HTTP结果封装
 * @author changxin
 * @date 2019-10-16
 */
@Data
public class HttpResult {
    //http状态码
    private int code =200;
    //返回信息
    private String msg;
    //返回对象
    private Object data;
    /**
     * 默认返回错误
     */

    public static HttpResult error(){
        return error(HttpStatus.INTERNAL_SERVER_ERROR,"未知异常，请联系管理员");
    }

    /**
     * 自定义错误描述
     * @param msg
     * @return
     */

    public static HttpResult error(String msg){
        return error(HttpStatus.INTERNAL_SERVER_ERROR,msg);
    }

    /**
     * 默认状态码及错误描述
     * @param httpStatus
     * @param msg
     * @return
     */
    public static HttpResult error(HttpStatus httpStatus,String msg){
        return error(HttpStatus.INTERNAL_SERVER_ERROR,msg);
    }

    /**
     * 自定义状态码与错误描述
     * @param code
     * @param msg
     * @return
     */
    public static HttpResult error(int code,String msg){
        HttpResult r = new HttpResult();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    /**
     * 自定义返回成功信息
     * @param msg
     * @return
     */
    public static HttpResult ok(String msg){
        HttpResult r = new HttpResult();
        r.setMsg(msg);
        return r;
    }

    /**
     * 自定义返回成功对象
     * @param data
     * @return
     */
    public static HttpResult ok(Object data){
        HttpResult r = new HttpResult();
        r.setData(data);
        return r;
    }

    /**
     * 默认成功返回
     * @return
     */
    public static HttpResult ok(){
        return new HttpResult();
    }

}
