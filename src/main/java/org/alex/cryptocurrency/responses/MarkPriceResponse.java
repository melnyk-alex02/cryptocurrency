package org.alex.cryptocurrency.responses;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class MarkPriceResponse {
    private String symbol;
    private BigDecimal markPrice;
    private BigDecimal indexPrice;
    private BigDecimal estimatedSettlePrice;
    private BigDecimal lastFundingRate;
    private Long nextFundingTime;
    private BigDecimal interestRate;
    private Long time;
}