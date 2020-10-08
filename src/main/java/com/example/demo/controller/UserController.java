package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserPage;
import com.example.demo.service.Impl.UserServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @PostMapping("/addUser")
    public void addUser(HttpServletResponse response, UserEntity user) {
        if (userService.addUser(user) > 0) {
            OutputInfo(response,"add success");
        } else {
            OutputInfo(response,"add failed");
        }
    }

    @ResponseBody // @ResponseBody 注释用于方法上，作用是返回固定数据格式。如json、xml。
    @GetMapping("/selectUserPage")
    public String selectUserPage(HttpServletResponse response, int current, int size) {
        UserPage userPage = userService.getUserIPage(current,size);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(userPage);
      //  System.out.println(jsonStr);
      //  OutputInfo(response,jsonStr);
        return gson.toJson(userPage);
    }

    @PostMapping("/delUser")
    public void delUser(HttpServletResponse response, String id) {
        if (userService.delUser(Integer.parseInt(id)) > 0) {
            OutputInfo(response,"删除完成");
        } else {
            OutputInfo(response,"删除失败");
        }
    }

    @PostMapping("/update")
    public void updateUser(HttpServletResponse response,UserEntity user) {
        System.out.println(user.toString());
        if (userService.updateUser(user) > 0) {
            OutputInfo(response,"修改成功");
        } else {
            OutputInfo(response,"修改失败");
        }
    }
    private void OutputInfo(HttpServletResponse response,String outData) {
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(outData);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
    }
}