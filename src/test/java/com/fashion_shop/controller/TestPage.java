package com.fashion_shop.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fashion.mapper.ShopItemMapper;
import com.fashion.pojo.ShopItem;
import com.fashion.pojo.ShopItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class TestPage {

	@Test
	public void testPage(){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		ShopItemMapper mapper = applicationContext.getBean(ShopItemMapper.class);
		
		ShopItemExample example = new ShopItemExample();
		
		//分页查询
		PageHelper.startPage(1, 10);
		List<ShopItem> list = mapper.selectByExample(example);
		//获取商品列表
		for (ShopItem shopItem : list) {
			System.out.println(shopItem.getTitle());
		}
		//获取分页信息
		PageInfo<ShopItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println("共有商品"+total );
		
		
		
		
		
	}
	
}
