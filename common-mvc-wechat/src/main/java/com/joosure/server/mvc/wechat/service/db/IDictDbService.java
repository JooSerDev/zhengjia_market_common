package com.joosure.server.mvc.wechat.service.db;

import java.util.List;

import com.joosure.server.mvc.wechat.entity.pojo.Dict;

public interface IDictDbService {
//	List<Dict> getScoreEventMap(String string);

	List<Dict> getAllDict(Dict cond);

	/**
	 * 更新字典
	 * @param dict
	 * @return
	 */
	int updateDict(Dict dict);

	int insertDict(Dict cond);
	
}
