package com.miaojinbo.gulimall.member.feign;

import com.miaojinbo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther miaojinbo
 * @Create 2022-07-12-19:09
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();


}
