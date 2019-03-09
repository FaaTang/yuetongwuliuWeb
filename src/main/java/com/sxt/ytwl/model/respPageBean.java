package com.sxt.ytwl.model;

import java.util.List;

public class respPageBean {
    private List<?> data;
    private long total;

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
