package com.alaya35.sparkproject.dao.impl;

import com.alaya35.sparkproject.dao.ISessionRandomExtractDAO;
import com.alaya35.sparkproject.domain.SessionRandomExtract;
import com.alaya35.sparkproject.jdbc.JDBCHelper;

/**
 * 随机抽取session的DAO实现
 * @author Administrator
 *
 */
public class SessionRandomExtractDAOImpl implements ISessionRandomExtractDAO {

	/**
	 * 插入session随机抽取
	 * @param sessionAggrStat 
	 */
	public void insert(SessionRandomExtract sessionRandomExtract) {
		String sql = "insert into session_random_extract values(?,?,?,?,?)";
		
		Object[] params = new Object[]{sessionRandomExtract.getTaskid(),
				sessionRandomExtract.getSessionid(),
				sessionRandomExtract.getStartTime(),
				sessionRandomExtract.getSearchKeywords(),
				sessionRandomExtract.getClickCategoryIds()};
		
		JDBCHelper jdbcHelper = JDBCHelper.getInstance();
		jdbcHelper.executeUpdate(sql, params);
	}
	
}
