package com.tentcoo.baselibrary.baseBean;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public class Event<T> {
    private int code;
    private T data;

    public Event() {
        super();
    }

    public Event(int code) {
        this.code = code;
    }

    public Event(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
