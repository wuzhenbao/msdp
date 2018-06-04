package com.wuzhenbao.msdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wuzhenbao.msdp.user.api.service.MsdpUserService;
import com.wuzhenbao.sb.it.commons.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	@Reference(interfaceClass=com.wuzhenbao.msdp.user.api.service.MsdpUserService.class)
	private MsdpUserService userService;
	@RequestMapping("/getUser")
	public String index() {
		String time = "";
		UserVO user = userService.getUser();
		System.out.println(user+time);
		return "/user/init";
	}
}
