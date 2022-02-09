package com.maybe.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.maybe.demo.entity.UserInfo;
import com.maybe.demo.service.UserInfoService;
import com.maybe.demo.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/web/demo")
public class WebController {

    @GetMapping("/axios_get")
    public String commonParam(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String method = request.getParameter("method");
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");

        System.out.println("method = " + method);
        System.out.println("userName = " + userName);
        System.out.println("userPwd = " + userPwd);

//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().write("服务器端返回普通文本字符串作为响应");

        JSONObject jsonObject = new JSONObject(new LinkedHashMap<>());
        jsonObject.put("userName", userName);
        jsonObject.put("userGender", "male");
        jsonObject.put("userAge", 20);

        return JSONObject.toJSONString(jsonObject);
    }

}
