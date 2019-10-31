package com.houpu.web.Controller;

import com.houpu.entity.Brand;
import com.houpu.service.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:pjq
 * @Date: 2019/10/29 19:29
 */
@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    public BrandServiceImpl brandService;

    @GetMapping("find")
    public List<Brand> selectFindAll() {
        return brandService.selectAll();
    }

    @GetMapping("findName/{name}")
    public List<Brand> findName(@PathVariable String name) {
        return brandService.findBrandByName(name);
    }

    //POST请求是用来向服务端请求新增资源（resource），处理成功的话，服务端一般返回状态码201。
    @PostMapping("add")
    public String add(String name, String image, String letter, Integer seq) {
        return brandService.add(name, image, letter, seq);
    }

    //DELETE请求一般是用来向服务端请求删除某个已存在的资源（resource），服务端一般返回200，202等。
    @DeleteMapping("del")
    public int del(Integer id) {
        return brandService.delete(id);
    }

    //GET请求是向服务端请求获取某个或某些资源（resource），比如查询数据库单个或list数据，服务端成功的话，一般状态码返回200。
    @GetMapping("findw")
    public List<Brand> findw(Integer pageNum) {
        return brandService.selectAllbyW(pageNum);
    }

    /**
     * PUT和PATCH都是用来修改服务端某个资源的，
     * 但是PUT和PATCH修改时提交的数据是不同的，
     * PUT是将整个资源的信息都提交到服务端，包括修改的，
     * 未修改的都提交到服务端，而PATCH只提交已修改的字段到服务端。
     * 而服务端对PUT请求应该是整体替换，PATCH请求只修改提交的字段。
     * 所以PUT请求应该是幂等的，即多次提交同一个请求，结果是相同的。
     * ————————————————
     * @param brand
     * @return
     */
    //PATCH请求一般是对某个资源做局部修改,如个别字段。
    //PUT请求一般是用来向服务端请求修改某个已存在的资源（resource）,服务端一般返回状态码200，204等。
    @PutMapping("edit")
    public int edit(Brand brand) {
        return brandService.editById(brand);
    }
}
