package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserPage;
import com.example.demo.service.Impl.LoginService;
import com.example.demo.service.Impl.UserServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class JumpController {

    private final UserServiceImpl userService;
    private final LoginService loginService;

    @Autowired
    public JumpController(UserServiceImpl userService, LoginService loginService) {
        this.userService = userService;
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String index() {
      //  UserEntity user = new UserEntity();
      //  user.setId(1);
//        user.setName("jk");
//        user.setPassword("a786");
      //  System.out.println(userService.delUser(3));
        //System.out.println(userService.selectUserAll());
        for (int i = 0; i < 20; i++) {
            UserEntity user = new UserEntity();
            //user.setId(1);
            user.setName("jk"+i);
            user.setPassword("a786"+i);
            user.setEmail(i+"@qq.com");
          //  userService.addUser(user);
        }

        //userService.selectByNameLike("");
        UserEntity userEntity = new UserEntity();
        userEntity.setName("jk2");
        userEntity.setPassword("a7862");
       // loginService.login(userEntity);
        return "pages/index.html";
    }

    @GetMapping("/jumpupdate")
    public String jumpUpdate(ModelMap map, String id) {
        UserEntity user = new UserEntity();
        user.setId(Integer.parseInt(id));
        Gson gson = new Gson();
        String jsonStr = gson.toJson(userService.selectUserById(user));
        map.put("user",jsonStr);
        return "pages/modify.html";
    }
}
