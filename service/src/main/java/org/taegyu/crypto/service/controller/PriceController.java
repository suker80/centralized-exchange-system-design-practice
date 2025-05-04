package org.taegyu.crypto.service.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.taegyu.crypto.service.model.response.CoinPriceResponse;
import org.taegyu.crypto.service.model.response.RealtimePriceResponse;
import org.taegyu.crypto.service.model.type.CoinType;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/price")
public class PriceController {

    @GetMapping("/realtime")
    public RealtimePriceResponse getRealtimePrice(
            @RequestParam CoinType coin
    ) {

        return new RealtimePriceResponse(null, null);
    }

    @GetMapping("/list")
    public Map<String, CoinPriceResponse> getAllCoinPriceList() {

        return new HashMap<>();
    }
}
