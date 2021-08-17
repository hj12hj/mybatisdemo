package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.Tea;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.mapper
 * @ClassName: TeaMapper
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/16 12:31 上午
 * @Version: 1.0
 */
@Repository
public interface TeaMapper {

    void update(Tea tea);

    void inseartOne(Tea tea);

}
