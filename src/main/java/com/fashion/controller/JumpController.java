package com.fashion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳转页面
 * @ClassName: <p>JumpController</p> 
 * @author 马颖
 * @version 1.0
 */
@Controller
public class JumpController {

	/**
	 * 首页
	 */
	@RequestMapping("/")
	public String goIndex(){
		
		return "index";
	}
	/**
	 * 
	 * @param topage
	 * @return 去其他页面
	 */
	@RequestMapping("/{topage}")
	public String fashionPage(@PathVariable String topage){
		return topage;
	}
}
