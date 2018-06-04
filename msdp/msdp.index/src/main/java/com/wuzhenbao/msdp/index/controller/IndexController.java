package com.wuzhenbao.msdp.index.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
	private static Logger log = Logger.getLogger(IndexController.class);
	
	public String redirectUrl(String url) {
		log.info("跳转地址："+url);
		return url;
	}
	
}
