package com.example.mybatisdemo;

import com.example.mybatisdemo.mapper.DeptMapper;
import com.example.mybatisdemo.mapper.TeaMapper;
import com.example.mybatisdemo.pojo.Dept;
import com.example.mybatisdemo.pojo.Tea;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisdemoApplicationTests {

    @Autowired
    DeptMapper deptMapper;

    @Test
    void contextLoads() {

        final List<Dept> all = deptMapper.findAll();

        for (Dept dept : all) {

            System.out.println(dept);
        }

    }


    @Autowired
    TeaMapper teaMapper;

    @Test
    void hh(){


        teaMapper.inseartOne(new Tea(1,"22",3));
    }



}
