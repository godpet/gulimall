package com.miaojinbo.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miaojinbo.gulimall.coupon.entity.CategoryBoundsEntity;
import com.miaojinbo.gulimall.coupon.service.CategoryBoundsService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.common.utils.R;



/**
 * 商品分类积分设置
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 20:39:07
 */
@RestController
@RequestMapping("coupon/categorybounds")
public class CategoryBoundsController {
    @Autowired
    private CategoryBoundsService categoryBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:categorybounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:categorybounds:info")
    public R info(@PathVariable("id") Long id){
		CategoryBoundsEntity categoryBounds = categoryBoundsService.getById(id);

        return R.ok().put("categoryBounds", categoryBounds);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:categorybounds:save")
    public R save(@RequestBody CategoryBoundsEntity categoryBounds){
		categoryBoundsService.save(categoryBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:categorybounds:update")
    public R update(@RequestBody CategoryBoundsEntity categoryBounds){
		categoryBoundsService.updateById(categoryBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:categorybounds:delete")
    public R delete(@RequestBody Long[] ids){
		categoryBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
