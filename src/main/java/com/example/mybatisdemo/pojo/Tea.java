package com.example.mybatisdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.pojo
 * @ClassName: Tea
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/16 12:17 上午
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Tea {
    Integer id;
    String name;
    Integer stuId;
}
