package com.example.mybatisdemo.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.pojo
 * @ClassName: Stu
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/15 11:55 下午
 * @Version: 1.0
 */
@Data
public class Stu {
    Integer id;
    String name;
    Integer deptId;
    List<Tea> teaList;

}
