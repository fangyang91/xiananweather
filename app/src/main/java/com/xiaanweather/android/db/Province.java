package com.xiaanweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Author     : yangfang
 * Date       : 2017/2/27 22:20
 */
public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
