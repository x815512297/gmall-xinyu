package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author xinyu
 * @email 815512297@qq.com
 * @date 2019-09-21 15:18:03
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);

   //根据分类等级或者父id查询分类
    List<CategoryEntity> queryCategoryByCidOrlevel(Integer level, Long parentCid);
}

