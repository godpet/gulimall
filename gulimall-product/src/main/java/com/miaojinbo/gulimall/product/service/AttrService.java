package com.miaojinbo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.gulimall.product.entity.AttrEntity;
import com.miaojinbo.gulimall.product.vo.AttrRespVo;
import com.miaojinbo.gulimall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 16:54:47
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);
}

