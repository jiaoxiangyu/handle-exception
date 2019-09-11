package cn.wt.handleexception.constants;

/**
 * @ClassName: ResultEnum
 * @Description: 响应状态码和提示枚举类
 * @Author jiaoxiangyu
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public enum ResultEnum {
    SERVER_ERROR(500, "服务端错误"),
    SUCCESS(0, "SUCCESS");

    private Integer code;//状态码

    private String msg;//获得提示信息

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
