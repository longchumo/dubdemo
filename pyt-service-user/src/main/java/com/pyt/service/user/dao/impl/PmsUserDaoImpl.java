package com.pyt.service.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.pyt.common.core.dao.BaseDaoImpl;
import com.pyt.facade.user.entity.PmsUser;
import com.pyt.service.user.dao.PmsUserDao;


/**
 * 
 * @描述: 用户表数据访问层接口实现类.
 */
@Repository("pmsUserDao")
public class PmsUserDaoImpl extends BaseDaoImpl<PmsUser> implements PmsUserDao {

	/**
	 * 根据用户登录名获取用户信息.
	 * 
	 * @param loginName
	 *            .
	 * @return user .
	 */

	public PmsUser findByUserNo(String userNo) {
		return super.getSqlSession().selectOne(getStatement("findByUserNo"), userNo);
	}

}
