package com.wuzhenbao.msdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/init")
	public String index() {
		String index ="index";
		System.out.println(index);
		return "index";
	}
	@RequestMapping("/redirectUrl")
	public String redirectUrl(String url) {
		System.out.println(url);
		return url;
	}
}
