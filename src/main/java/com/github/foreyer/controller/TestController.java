package com.github.foreyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.foreyer.core.controller.CrudController;
import com.github.foreyer.entity.Test;
import com.github.foreyer.service.ITestService;

@Controller
@RequestMapping("/test")
public class TestController extends CrudController<Test,ITestService>{
	
}