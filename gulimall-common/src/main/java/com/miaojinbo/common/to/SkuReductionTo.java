package com.miaojinbo.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther miaojinbo
 * @Create 2022-08-10-20:46
 */

@Data
public class SkuReductionTo {

    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;

}
