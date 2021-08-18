package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.pojo.Dept;
import com.example.mybatisdemo.pojo.Stu;
import com.example.mybatisdemo.pojo.Tea;
import com.sun.deploy.net.HttpRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.controller
 * @ClassName: TeaController
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/18 9:14 下午
 * @Version: 1.0
 */
@Api(tags = "生产者进程API接口")
@RestController
public class TeaController {


    @PostMapping("/list")
    @ApiOperation(value ="获取用户全部信息")
    @ApiImplicitParam(name="dept",value = "用户实体",required = true,dataType = "Dept")
    public String list(@RequestBody Dept dept, HttpServletRequest request){
        System.out.println(dept);
        System.out.println(request.getHeader("token"));
        return "list";
    }

    @GetMapping("/get")
    @ApiOperation(value ="获取用户单挑信息")
    public String get(@RequestParam @ApiParam(name="id",value = "用户id",required = true) String  id){
        return id;
    }

}
