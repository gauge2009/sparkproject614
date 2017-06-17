package com.alaya35.sparkproject.test;

import com.alaya35.sparkproject.dao.ITaskDAO;
import com.alaya35.sparkproject.dao.factory.DAOFactory;
import com.alaya35.sparkproject.domain.Task;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(1);
		System.out.println(task.getTaskName());  
	}
	
}
