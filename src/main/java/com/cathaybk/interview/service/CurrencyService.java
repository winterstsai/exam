package com.cathaybk.interview.service;

import com.cathaybk.interview.repo.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    @Autowired
    private CurrencyRepository currencyRepository;

    // 调用coindesk API，解析数据，并保存到数据库
    public void fetchAndSaveCurrencyData() {
        // 使用RestTemplate或其他HTTP客户端调用coindesk API
        // 解析API响应数据并保存到数据库
    }

    // 提供查询 / 新增 / 修改 / 刪除 幣別数据的方法
}

