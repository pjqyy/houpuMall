package com.houpu.service;

import com.houpu.entity.Brand;

import java.util.List;

/**
 * @Author:pjq
 * @Date: 2019/10/31 12:41
 */
public interface BrandService {
    /**
     * 查询所有
     * @return
     */
    List<Brand> selectAll();

    /**
     * 添加
     * @param name
     * @param image
     * @return
     */
    String add(String name, String image,String letter,Integer seq);

    /**
     * 名字查询
     * @param name
     * @return
     */
    List<Brand>  findBrandByName(String name) throws Exception;

    /**
     * 删除 id
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 分页 5条
     * @return
     */
    List<Brand> selectAllbyW(Integer pageNum);

    int editById(Brand brand);
}
