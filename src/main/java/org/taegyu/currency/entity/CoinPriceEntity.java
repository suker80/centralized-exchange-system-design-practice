package org.taegyu.currency.entity;

import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;

@RedisHash
public class CoinPriceEntity {

    private BigDecimal price;
    private BigDecimal coinId;
    private BigDecimal priceChange24h;
}
