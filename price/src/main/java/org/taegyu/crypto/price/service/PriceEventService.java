package org.taegyu.crypto.price.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.taegyu.crypto.price.Price;
import org.taegyu.crypto.price.Price.PriceEvent;
import org.taegyu.crypto.price.model.PriceEventDto;

import java.math.BigDecimal;

import static org.taegyu.crypto.price.util.ConvertUtil.ObjectToJson;

@Slf4j
@Service
@RequiredArgsConstructor
public class PriceEventService {

    private final RedisTemplate<String, byte[]> byteRedisTemplate;
    private final RedisTemplate<String, String> stringRedisTemplate;
    public static final String PRICE_PREFIX = "price";
    public static final String PRICE_CHANNEL = "price:channel";

    public void processPriceEvent(PriceEventDto priceEventDto) {
        String price = priceEventDto.getPrice();
        String symbol = priceEventDto.getSymbol();

        log.info("Processing price event: {}", priceEventDto);

        String priceKey = String.join(":", PRICE_PREFIX, symbol.toLowerCase());

        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set(priceKey, String.valueOf(price));

        byteRedisTemplate.convertAndSend(PRICE_CHANNEL, PriceEvent.newBuilder()
                .setSymbol(symbol)
                .setPrice(price)
                .build().toByteArray());
    }
}