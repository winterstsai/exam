package com.cathaybk.interview.service;

import com.cathaybk.interview.rs.CoinDeskRs;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinDeskService {
    private final String COINDESK_API_URL = "https://api.coindesk.com/v1/bpi/currentprice.json";

    private final RestTemplate restTemplate;

    public CoinDeskService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CoinDeskRs getCurrentPrice() {
        return restTemplate.getForObject(COINDESK_API_URL, CoinDeskRs.class);
    }
}

