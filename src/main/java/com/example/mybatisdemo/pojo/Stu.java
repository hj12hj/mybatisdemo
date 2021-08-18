package com.example.mybatisdemo.pojo;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value="用户ID",name="id",example="111",required = true)
    Integer id;
    String name;
    Integer deptId;
    List<Tea> teaList;

}
