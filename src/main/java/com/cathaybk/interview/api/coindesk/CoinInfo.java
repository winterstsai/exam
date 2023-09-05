package com.cathaybk.interview.api.coindesk;

import com.cathaybk.interview.api.coindesk.CurrencyInfo;

public class CoinInfo {
    private String updateTime;
    private CurrencyInfo currencyInfo;

    public CurrencyInfo getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}

