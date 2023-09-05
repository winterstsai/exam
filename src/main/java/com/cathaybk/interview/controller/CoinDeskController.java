package com.cathaybk.interview.controller;

import com.cathaybk.interview.rs.CoinDeskRs;
import com.cathaybk.interview.api.coindesk.CoinInfo;
import com.cathaybk.interview.service.CoinDeskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coindesk")
public class CoinDeskController {
    private final CoinDeskService coinDeskService;

    public CoinDeskController(CoinDeskService coindeskService) {
        this.coinDeskService = coindeskService;
    }

    @GetMapping("/current-price")
    public CoinInfo getCurrentPriceInfo() {
        CoinDeskRs coinDeskRs = coinDeskService.getCurrentPrice();

        // 对coindeskResponse进行数据转换，生成新的API响应对象CoinInfo
        CoinInfo coinInfo = new CoinInfo();
        coinInfo.setUpdateTime(coinDeskRs.getTime().get("updated").toString());
        coinInfo.setCurrencyInfo(coinDeskRs.getBpi().get("USD"));

        return coinInfo;
    }
}

