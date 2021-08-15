package com.example.mybatisdemo.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.pojo
 * @ClassName: dept
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/15 11:17 下午
 * @Version: 1.0
 */
@Data
public class Dept {

    Integer id;
    Integer age;
    String  name;
    Stu stu;
}
