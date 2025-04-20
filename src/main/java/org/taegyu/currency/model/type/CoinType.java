package org.taegyu.currency.model.type;


import lombok.Getter;

@Getter
public enum CoinType {

    ETHEREUM("ethereum", "ETH"),
    BITCOIN("bitcoin", "BTC"),
    ;

    private final String name;
    private final String symbol;

    CoinType(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}
