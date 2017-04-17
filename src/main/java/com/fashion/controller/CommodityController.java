package com.fashion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fashion.pojo.ShopItem;
import com.fashion.service.CommodityService;

/**
 * 
 * @author Administrator
 * 商品Controller
 */
@Controller
public class CommodityController {

	@Autowired
	private CommodityService commodityService;
	
	//配置URL和映射关系
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	//从路径中取得ID
	public ShopItem getShopItemById(@PathVariable Long itemId){
		ShopItem shopItem = commodityService.getCommodityById(itemId);
		return shopItem;
	}
	
	
	
	
}
