package com.github.foreyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.foreyer.core.controller.CrudController;
import com.github.foreyer.entity.Goods;
import com.github.foreyer.service.IGoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController extends CrudController<Goods,IGoodsService>{
	
}