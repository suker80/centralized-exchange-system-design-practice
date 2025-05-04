package org.taegyu.crypto.service.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.taegyu.crypto.service.model.type.TransactionType;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionHistoryItemResponse {

    private Instant contractTime;

    private Instant orderTime;

    private String symbol;

    private TransactionType transactionType;

    private BigDecimal amount;

    private BigDecimal unitPrice;

    private BigDecimal totalPrice;

    private BigDecimal fee;

    private BigDecimal settlementAmount;

}
