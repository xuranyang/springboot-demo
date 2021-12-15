package com.maybe.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.maybe.demo.entity.UserInfo;
import com.maybe.demo.mapper.UserInfoMapper;
import com.maybe.demo.service.UserInfoService;
import com.maybe.demo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoLimit() {
        return userInfoMapper.getUserInfoLimit();
    }

    @Override
    public List<UserVO> getOnlyUserInfo() {
        List<UserVO> userVOList = Lists.newArrayList();

        List<UserInfo> userInfoLimit = userInfoMapper.getUserInfoLimit();

        userInfoLimit.forEach(userInfo -> {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userInfo, userVO);
            userVOList.add(userVO);
        });

        return userVOList;
    }
}
