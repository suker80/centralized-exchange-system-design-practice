package org.taegyu.crypto.service.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RealtimePriceResponse {

    private String coinName;
    private BigDecimal price;


}
