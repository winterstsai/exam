package com.cathaybk.interview.rs;

import com.cathaybk.interview.api.coindesk.CurrencyInfo;

import java.util.Map;

public class CoinDeskRs {
    private String disclaimer;
    private Map<String, Object> time;
    private String chartName;
    private Map<String, CurrencyInfo> bpi;
    public Map<String, CurrencyInfo> getBpi() {
        return bpi;
    }

    public void setBpi(Map<String, CurrencyInfo> bpi) {
        this.bpi = bpi;
    }

    public Map<String, Object> getTime() {
        return time;
    }

    public void setTime(Map<String, Object> time) {
        this.time = time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }
}


