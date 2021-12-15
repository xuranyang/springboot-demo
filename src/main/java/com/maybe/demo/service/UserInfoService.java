package com.maybe.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maybe.demo.entity.UserInfo;
import com.maybe.demo.vo.UserVO;

import java.util.List;

public interface UserInfoService extends IService<UserInfo> {
    List<UserInfo> getUserInfoLimit();
    List<UserVO> getOnlyUserInfo();
}
