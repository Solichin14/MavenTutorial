package com.sol.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import com.sol.pojo.ParamRole;
import com.sol.pojo.Role;

public interface RoleMapper {
	public int insertRole(Role role);
	public int deleteRole(int id);
	public int updateRole(Role role);
	public Role getRole(int id);
	public List<Role> findRolesByName(String name);
	//@Select("select id, role_name as roleName, note from t_role where role_name like concat('%', #{roleName}, '%')")
	public List<Role> findRoles2(String name, RowBounds bonds);
	public List<Role> findRolesByNameAndNote(Role role);
	public List<Role> findRolesByNameAndNote2(@Param("rname") String rolename, @Param("note") String note);
	public List<Role> findRolesByNameAndNote3(@Param("paramRole") ParamRole pr, @Param("commonRole") Role role);

}
