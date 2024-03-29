package com.miaojinbo.gulimall.ware.dao;

import com.miaojinbo.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品库存
 * 
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 21:24:18
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(@Param("skuId") Long skuId,
                  @Param("wareId")Long wareId,
                  @Param("skuNum")Integer skuNum);
}
