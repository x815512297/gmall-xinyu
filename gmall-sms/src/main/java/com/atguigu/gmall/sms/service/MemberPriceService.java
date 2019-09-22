package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.MemberPriceEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品会员价格
 *
 * @author xinyu
 * @email 815512297@qq.com
 * @date 2019-09-22 16:00:28
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageVo queryPage(QueryCondition params);
}

