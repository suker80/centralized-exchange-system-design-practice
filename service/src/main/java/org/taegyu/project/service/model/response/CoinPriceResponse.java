package org.taegyu.project.service.model.response;

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
