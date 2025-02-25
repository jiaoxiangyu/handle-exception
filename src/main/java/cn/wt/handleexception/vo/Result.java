package cn.wt.handleexception.vo;


import cn.wt.handleexception.constants.ResultEnum;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @Description: 返回响应数据格式
 * @Author jiaoxiangyu
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public class Result implements Serializable {
    private Integer code= ResultEnum.SUCCESS.getCode();
    private Object data;
    private String msg = ResultEnum.SUCCESS.getMsg();

    public Result() {
    }

    public Result(Object data){
        this.data = data;
    }

    public Result(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
