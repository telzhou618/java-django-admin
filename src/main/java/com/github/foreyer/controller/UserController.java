package com.github.foreyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.foreyer.core.controller.CrudController;
import com.github.foreyer.entity.User;
import com.github.foreyer.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends CrudController<User,IUserService>{
	
}