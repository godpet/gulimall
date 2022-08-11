package com.miaojinbo.gulimall.product.feign;

import com.miaojinbo.common.to.SkuReductionTo;
import com.miaojinbo.common.to.SpuBoundTo;
import com.miaojinbo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther miaojinbo
 * @Create 2022-08-10-19:47
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 1、CouponFeignService.saveSpuBounds(spuBoundTo)
     *      1)@RequestBody将这个对象转为json;
     *      2)找到gulimall-coupon服务，给/coupon/spubounds/save发送请求，将上一步转成的json放在请求体中，发送请求
     *      3)对方服务收到请求，请求体中的json数据。
     *          (@RequestBody SpuBoundsEntity spuBounds)将请求体的json转为SpuBoundsEntity
     * 只要json数据模型兼容，双方服务无需使用同一个to
     * @param spuBoundTo
     * @return
     */
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
