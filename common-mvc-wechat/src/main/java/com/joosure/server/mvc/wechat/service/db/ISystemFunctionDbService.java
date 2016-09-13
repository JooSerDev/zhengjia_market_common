package com.joosure.server.mvc.wechat.service.db;

import org.apache.ibatis.annotations.Param;

import com.joosure.server.mvc.wechat.entity.pojo.CheckCode;
import com.joosure.server.mvc.wechat.entity.pojo.PageViewLog;

public interface ISystemFunctionDbService {
	public void saveCheckCode(CheckCode checkCode);

	public void deleteCheckCodeByMobile(String mobile);

	public CheckCode getCheckCodeInTime(String mobile, String code, Long timestamp);
	
	public void savePageViewLog(PageViewLog pageViewLog);
}
