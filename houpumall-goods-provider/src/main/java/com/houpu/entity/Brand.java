package com.houpu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_brand")
public class Brand implements Serializable{
    /**
     * 品牌id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 品牌名称
     */

    private String name;

    /**
     * 品牌图片地址
     */
    private String image;

    /**
     * 品牌的首字母
     */
    private String letter;

    /**
     * 排序
     */
    private Integer seq;

    private static final long serialVersionUID = 1L;

    public Brand(String name, String image, String letter, Integer seq) {
        this.name = name;
        this.image = image;
        this.letter = letter;
        this.seq = seq;
    }

}

