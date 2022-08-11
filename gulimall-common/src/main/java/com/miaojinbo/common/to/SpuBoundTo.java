package com.miaojinbo.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther miaojinbo
 * @Create 2022-08-10-20:10
 */

@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;



}
