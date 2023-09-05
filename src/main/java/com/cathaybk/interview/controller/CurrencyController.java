package com.cathaybk.interview.controller;

import com.cathaybk.interview.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    // 定义API端点，提供更新时间和幣別相关信息的API
}

