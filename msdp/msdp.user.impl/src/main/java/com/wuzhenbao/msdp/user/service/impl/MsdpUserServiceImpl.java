package com.wuzhenbao.msdp.user.service.impl;

import java.sql.SQLException;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.wuzhenbao.msdp.user.api.service.MsdpUserService;
import com.wuzhenbao.msdp.user.dao.UserDao;
import com.wuzhenbao.sb.it.commons.vo.UserVO;

public class MsdpUserServiceImpl implements MsdpUserService {
	private static Logger log = Logger.getLogger(MsdpUserServiceImpl.class);
	@Autowired
	private UserDao userDao;
	@Override
	public UserVO getUser() throws SQLException {
		UserVO user = new UserVO();
		user.setUserId(100000);
		user.setUserNameCn("wuzhenbao");
		user.setUserEmail("wuzhenbao@126.com");
		user.setDescription("sleep time is " + 1);
		if(userDao != null) {
			user = userDao.findUserById(user);
		}
		return user;
	}

	@Override
	public String indexJson() {
		log.info("excu indexJson ");
		Random random = new Random();
		/*int time = (random.nextInt(10)+1)*10000;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		UserVO user = new UserVO();
		user.setUserId(100000);
		user.setUserNameCn("wuzhenbao");
		user.setUserEmail("wuzhenbao@126.com");
		user.setDescription("sleep time is " + 1);
		String obj = JSON.toJSONString(user);
		log.info("excu indexJson .result "+obj);
		return obj.toString();
	}

}
