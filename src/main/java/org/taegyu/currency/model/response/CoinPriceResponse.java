package org.taegyu.currency.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CoinPriceResponse {

    private BigDecimal price;
    private BigDecimal change24h;

}
