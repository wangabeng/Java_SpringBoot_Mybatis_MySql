package com.ui.toto.toto.jpatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/jpauser")
public class JpaUserController {
	@Autowired
	private JpaUserService jpaUserService;
    @RequestMapping(value = "")
    public String getIndex(Model model){      
        JpaUser user = jpaUserService.getUser(new Integer(2));  
        model.addAttribute("user", user);   
        return "index";    
    }
}
