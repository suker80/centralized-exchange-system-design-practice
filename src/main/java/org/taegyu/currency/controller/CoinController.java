package org.taegyu.currency.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taegyu.currency.model.request.BuyCoinRequest;
import org.taegyu.currency.model.request.SellCoinRequest;

@RequiredArgsConstructor
@RestController
@RequestMapping("/coin")
public class CoinController {

    @PostMapping("/buy")
    private void buyCoin(@RequestBody @Valid BuyCoinRequest request) {

    }

    @PostMapping("/sell")
    private void sellCoin(@RequestBody @Valid SellCoinRequest request) {

    }
}
