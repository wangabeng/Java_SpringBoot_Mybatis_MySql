package com.ui.toto.toto.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ui.toto.toto.domain.User;
import com.ui.toto.toto.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired 
    private UserService userService;
    @RequestMapping(value = "")
    public String getIndex(Model model){      
        User user = userService.selectUserById(1);  
        model.addAttribute("user", user);   
        return "index";    
    }
}
