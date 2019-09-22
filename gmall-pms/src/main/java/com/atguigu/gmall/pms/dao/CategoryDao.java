package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xinyu
 * @email 815512297@qq.com
 * @date 2019-09-21 15:18:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
