package org.taegyu.crypto.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taegyu.crypto.service.model.response.TransactionHistoryItemResponse;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @GetMapping("/list")
    public List<TransactionHistoryItemResponse> getTransactionHistory() {


        return null;
    }
}
