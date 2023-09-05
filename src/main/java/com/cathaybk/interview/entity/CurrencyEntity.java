package com.cathaybk.interview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.math.BigDecimal;

@Entity
public class CurrencyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String chineseName;
    private BigDecimal exchangeRate;


}


