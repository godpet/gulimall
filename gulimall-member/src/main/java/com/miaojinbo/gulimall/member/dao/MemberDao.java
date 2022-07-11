package com.miaojinbo.gulimall.member.dao;

import com.miaojinbo.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 20:53:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
