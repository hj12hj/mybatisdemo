package com.example.mybatisdemo.quatzConfig;

import com.example.mybatisdemo.mapper.TeaMapper;
import com.example.mybatisdemo.pojo.Tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import javax.annotation.PreDestroy;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.quatzConfig
 * @ClassName: quatzconfig
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/17 10:51 下午
 * @Version: 1.0
 */
@Configuration
public class quatzconfig {

    @Bean
    ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }


    @Autowired
    TeaMapper teaMapper;

    @PreDestroy
    void doBeforeExit(){
        teaMapper.inseartOne(new Tea(3,"2",2));
        System.out.println("--------------------------");
    }


}
