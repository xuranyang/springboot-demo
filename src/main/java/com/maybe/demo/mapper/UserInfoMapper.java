package com.maybe.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maybe.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    List<UserInfo> getUserInfoLimit();
}
