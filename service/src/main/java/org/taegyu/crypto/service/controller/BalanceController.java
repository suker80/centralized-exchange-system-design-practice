package org.taegyu.crypto.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/balance")
public class BalanceController {

    public HashMap<String, String> getBalancePerCoin() {

        return new HashMap<String, String>();
    }
}
