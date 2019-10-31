package com.houpu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.houpu.entity.Brand;


/**
 * @Author:pjq
 * @Date: 2019/10/29 19:34
 */
public interface BrandMapper extends BaseMapper<Brand> {



   /* @Select("select *  from  tb_brand where name=#{name} ")
    Brand findBrandByName(@Param("name") String name);*/

}
