package cn.wt.handleexception.util;


import cn.wt.handleexception.constants.ResultEnum;
import cn.wt.handleexception.vo.Result;

/**
 * @ClassName: ResultUtil
 * @Description: Result生成工具
 * @Author jiaoxiangyu
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public class ResultUtil {


    public static Result success() {
        return success(null);
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
