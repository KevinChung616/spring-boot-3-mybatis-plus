package com.jtsp.springboot3mybatisplusdemo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("students")
public class Student {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String email;
}
