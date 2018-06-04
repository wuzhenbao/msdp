package org.msdp.permission.service.impl;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.wuzhenbao.msdp.permission.api.UserPermissionService;
import com.wuzhenbao.msdp.user.api.service.MsdpUserService;
import com.wuzhenbao.sb.it.commons.vo.UserVO;

public class UserPermissionServiceImpl implements UserPermissionService {
	private static Logger log = Logger.getLogger(UserPermissionServiceImpl.class);
	@Autowired
	private MsdpUserService userService;
	@Override
	public void getUser()  throws SQLException {
		UserVO user = null;
		try {
			user = userService.getUser();
		} catch (SQLException e) {
		}
		log.info("UserPermissionServiceImpl getUser:"+user);
	}

	@Override
	public void getUserInfo() throws Exception {
		String json = userService.indexJson();
		log.info("UserPermissionServiceImpl getUserInfo "+json);
	}

}
