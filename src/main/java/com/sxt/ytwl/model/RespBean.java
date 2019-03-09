package com.sxt.ytwl.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RespBean {
    private int status;
    private String msg;
    private Object obj;

    public static RespBean ok(String msg,Object obj){
        return new RespBean(200,msg,obj);
    }
    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }
    public static RespBean error(String msg,Object obj){
        return new RespBean(500,msg,obj);
    }
    public static RespBean error(int status,String msg,Object obj){
        return new RespBean(status,msg,obj);
    }
    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }

    public RespBean() {
    }

    public RespBean(int status, String msg, Object obj) {

        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
