package com.sol.mapper;

import java.util.List;

import com.sol.pojo.EmployeTask;

public interface EmployeeTaskMapper {
	public List<EmployeTask> getTaskByempId(int id);

}
