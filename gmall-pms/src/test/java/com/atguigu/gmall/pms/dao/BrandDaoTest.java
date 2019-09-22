package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.BrandEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xinyu
 * @date 2019-09-22 16:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandDaoTest {

    @Autowired
    private BrandDao brandDao;

    @Test
    public void Test(){
        BrandEntity brandEntity =new BrandEntity();
        brandEntity.setName("尚硅谷");
        brandEntity.setDescript("尚硅谷就是好");
        brandEntity.setFirstLetter("S");
        this.brandDao.insert(brandEntity);

    }
}
