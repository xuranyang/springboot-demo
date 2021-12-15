package com.maybe.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfo {
    @TableField(value = "userId")
    private String userId;
    @TableField(value = "userName")
    private String userName;
    private String age;
    private String nationality;
}
