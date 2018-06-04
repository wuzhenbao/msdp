package com.wuzhenbao.msdp.user.api.service;

import java.sql.SQLException;

import com.wuzhenbao.sb.it.commons.vo.UserVO;

public interface MsdpUserService {
	public UserVO getUser()throws SQLException;
	public String indexJson()throws Exception;
}
