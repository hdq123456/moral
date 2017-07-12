package com.pykj.moral.utils;

import java.util.List;


/**
 * 淘淘商城自定义响应结构
 */
public class ResultOut {

 
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ResultOut build(Integer status, String msg, Object data) {
        return new ResultOut(status, msg, data);
    }

    public static ResultOut ok(Object data) {
        return new ResultOut(data);
    }

    public static ResultOut ok() {
        return new ResultOut(null);
    }

    public ResultOut() {

    }

    public static ResultOut build(Integer status, String msg) {
        return new ResultOut(status, msg, null);
    }

    public ResultOut(Integer status, String msg, Object data) {
    	//状态；
        this.status = status;
        //信息；
        this.msg = msg;
        
        this.data = data;
    }

    public ResultOut(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public static ResultOut nullError() {
		return new ResultOut(404, "没有取到数据", null);
		
	}

}


