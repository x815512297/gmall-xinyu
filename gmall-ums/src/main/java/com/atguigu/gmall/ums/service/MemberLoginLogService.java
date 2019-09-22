package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberLoginLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author xinyu
 * @email 815512297@qq.com
 * @date 2019-09-22 16:03:38
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

