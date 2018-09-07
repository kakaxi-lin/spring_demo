package com.yk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class SpringMVCDemo {
	
@RequestMapping(value="/first")
@ResponseBody
public User firstMethod(Integer userId){
	System.out.println("obj.."+userId);
	User u=new User();
	u.setId(5);
	u.setName("哈哈哈x");
	return u;
}
}
