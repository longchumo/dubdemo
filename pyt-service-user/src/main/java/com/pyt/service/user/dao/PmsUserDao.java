package com.pyt.service.user.dao;

import com.pyt.common.core.dao.BaseDao;
import com.pyt.facade.user.entity.PmsUser;


/**
 * 
 * @描述: 用户表数据访问层接口.
 */
public interface PmsUserDao extends BaseDao<PmsUser> {

	/**
	 * 根据用户登录名获取用户信息.
	 * 
	 * @param loginName
	 *            .
	 * @return user .
	 */
	PmsUser findByUserNo(String userNo);

}
