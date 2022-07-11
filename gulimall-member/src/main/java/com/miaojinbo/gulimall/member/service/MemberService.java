package com.miaojinbo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 20:53:32
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

