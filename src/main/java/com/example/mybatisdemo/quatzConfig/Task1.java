package com.example.mybatisdemo.quatzConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.quatzConfig
 * @ClassName: Task1
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/17 10:52 下午
 * @Version: 1.0
 */
public class Task1 implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(Task1.class);
    @Override
    public void run() {
        logger.info("task  running");
    }
}
