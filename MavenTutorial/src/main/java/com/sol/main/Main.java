package com.sol.main;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.sol.mapper.RoleMapper;
import com.sol.pojo.ParamRole;
import com.sol.pojo.Role;
import com.sol.utils.SqlSessionFactoryUtils;

public class Main {

	public static void main(String[] args) {
		SqlSessionFactoryUtils util = new SqlSessionFactoryUtils();
		SqlSession session = util.getSqlSession();
		RoleMapper mapper = session.getMapper(RoleMapper.class);
		Role r = new Role();
		r.setRoleName("manager");
		r.setNote("manage all the website");
		mapper.insertRole(r);
		System.out.println("the insert Id is: "+r.getId());
		session.commit();
		ParamRole pr = new ParamRole();
		pr.setName("ad");
		List<Role> list = mapper.findRolesByNameAndNote3(pr,r);
		
		for(int i = 0; i < 2;i++) {
			RowBounds bonds = new RowBounds(i,1);
			list = mapper.findRoles2("ad", bonds);
			
			for(Role re : list) {
				System.out.println(re.getRoleName());
			}
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		}
		
//		Role role = mapper.getRole(1);
//		System.out.println(role.getRoleName());
		session.close();

	}

}
