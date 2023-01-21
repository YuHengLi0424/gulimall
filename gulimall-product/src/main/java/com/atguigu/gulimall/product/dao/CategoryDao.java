package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xenon
 * @email 768527756@qq.com
 * @date 2023-01-19 00:14:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
