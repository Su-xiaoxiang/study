package com.zs.util;

import java.util.HashMap;
import java.util.List;

/**
 * LayUI数据表格结果处理类
 */
public class Result extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    
    public Result() {
        put("code", 0);
        put("msg", "");
    }
    
    public static Result ok() {
        return new Result();
    }
    
    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }
    
    public static Result error(String msg) {
        return error(500, msg);
    }
    
    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }
    
    /**
     * 设置LayUI数据表格的数据
     */
    public Result setData(List<?> data, long count) {
        put("data", data);
        put("count", count);
        return this;
    }
    
    /**
     * 放入数据
     */
    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
} 