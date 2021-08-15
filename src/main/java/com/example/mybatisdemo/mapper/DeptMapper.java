package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.mapper
 * @ClassName: DeptMapper
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/15 11:17 下午
 * @Version: 1.0
 */
@Repository
public interface DeptMapper {

    List<Dept> findAll();

}
