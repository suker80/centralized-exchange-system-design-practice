package org.taegyu.crypto.price.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.taegyu.crypto.price.model.PriceEventDto;

import java.math.BigDecimal;

import static org.taegyu.crypto.price.util.ConvertUtil.ObjectToJson;

@Slf4j
@Service
@RequiredArgsConstructor
public class PriceEventService {

    private final RedisTemplate<String, String> redisTemplate;
    public static final String PRICE_PREFIX = "price";
    public static final String PRICE_CHANNEL = "price:channel";

    public void processPriceEvent(PriceEventDto priceEventDto) {
        BigDecimal price = priceEventDto.getPrice();
        String symbol = priceEventDto.getSymbol();

        log.info("Processing price event: {}", priceEventDto);

        String priceKey = String.join(":", PRICE_PREFIX, symbol.toLowerCase());

        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(priceKey, String.valueOf(price));

        redisTemplate.convertAndSend(PRICE_CHANNEL, ObjectToJson(priceEventDto));
    }
}