package com.sol.main;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.sol.mapper.EmployeeMapper;
import com.sol.mapper.RoleMapper;
import com.sol.pojo.EmployeTask;
import com.sol.pojo.Employee;
import com.sol.pojo.ParamRole;
import com.sol.pojo.Role;
import com.sol.pojo.WorkCard;
import com.sol.utils.SqlSessionFactoryUtils;

public class EmployeeMain {

	public static void main(String[] args) {
		SqlSessionFactoryUtils util = new SqlSessionFactoryUtils();
		SqlSession session = util.getSqlSession();
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		
		Employee em = mapper.getEmployeeById(1);
		System.out.println(em.getRealname());
		System.out.println(em.getSex());
//		System.out.println(em.getWorkCard().getRealName());
////		List<EmployeTask> list = em.getTaskList();
//		
//		System.out.println("here are employee");
//		for (EmployeTask et : list) {
//			System.out.println(et.getTaskName());
//		}
//		session.close();

	}

}
