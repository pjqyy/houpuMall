package com.houpu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.houpu.entity.Brand;
import com.houpu.mapper.BrandMapper;
import com.houpu.service.BrandService;
import com.houpu.web.generator.BrandNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:pjq
 * @Date: 2019/10/29 19:34
 */
@Slf4j
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> selectAll() {
        return brandMapper.selectList(null);
    }
    /**
     * 添加
     *
     * @param name
     * @param image
     * @param letter
     * @param seq
     * @return
     */
    @Override
    public String add(String name, String image, String letter, Integer seq) {
        Brand brand = new Brand();
        brand.setName(name);
        brand.setImage(image);
        brand.setLetter(letter);
        brand.setSeq(seq);
        brandMapper.insert(brand);
        return "success" + brand.toString();
    }

    @Override
    public List<Brand> findBrandByName(String name){
        QueryWrapper<Brand> wrapper =  new QueryWrapper<>();
        wrapper.like("name",name);

       if (name.equals("999")){
               throw  new BrandNotExistException();
       }
        return  brandMapper.selectList(wrapper);
    }

    @Override
    public int delete(Integer id) {
        return brandMapper.deleteById(id);
    }

    @Override
    public List<Brand> selectAllbyW(Integer pageNum) {

        Page<Brand> employees = (Page<Brand>)
                brandMapper.selectPage(new Page<>(pageNum, 10), null);
        return employees.getRecords();
    }

    @Override
        public int editById(Brand brand) {
        return brandMapper.updateById(brand);
    }


}
