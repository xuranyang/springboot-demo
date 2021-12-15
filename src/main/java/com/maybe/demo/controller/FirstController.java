package com.maybe.demo.controller;

import com.maybe.demo.entity.UserInfo;
import com.maybe.demo.service.UserInfoService;
import com.maybe.demo.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "测试模块")
@RestController
@RequestMapping("/api/demo")
public class FirstController {

    @Autowired
//    @Resource
    private UserInfoService userInfoService;

    @ApiOperation("测试接口")
    @GetMapping("/first")
    public String firstApi() {
        return "first api";
    }


    @GetMapping("/get_user_info")
    public List<UserInfo> getUserInfo() {
        List<UserInfo> userInfoList = userInfoService.list();
        return userInfoList;
    }

    @GetMapping("/get_user_info/limit")
    public List<UserInfo> getUserInfoListLimit() {
        return userInfoService.getUserInfoLimit();
    }

    @GetMapping("/get_only_user_info/limit")
    public List<UserVO> getOnlyUserInfo() {
        return userInfoService.getOnlyUserInfo();
    }

}
