package org.taegyu.crypto.service.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BuyCoinRequest {
    private BigDecimal amount;
    private BigDecimal price;
}
