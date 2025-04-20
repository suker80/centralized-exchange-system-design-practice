package org.taegyu.currency.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SellCoinRequest {
    private BigDecimal amount;
    private BigDecimal price;
}
