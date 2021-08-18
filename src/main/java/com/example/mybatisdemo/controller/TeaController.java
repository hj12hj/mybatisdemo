package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.pojo.Stu;
import com.example.mybatisdemo.pojo.Tea;
import com.sun.deploy.net.HttpRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    @ApiOperation(value ="获取用户全部信息",notes = "注意这里没有分页")
    @ApiImplicitParam(name="stu",value = "用户实体",required = true,dataType = "Stu")
    public String list(@RequestBody Stu stu, HttpServletRequest request){
        System.out.println(stu);
        System.out.println(request.getHeader("token"));
        return "list";
    }

}
