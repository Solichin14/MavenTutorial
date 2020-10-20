package com.sol.pojo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class SexEnumHandler implements TypeHandler<SexEnum>{

	@Override
	public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
		// TODO Auto-generated method stub
		ps.setInt(i, parameter.getSexid());
	}

	@Override
	public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		int id = rs.getInt(columnName);
//		if (id == 1) {
//			return SexEnum.Male;
//		}
//		return SexEnum.Female;
		return SexEnum.getSexEnumById(id);
	}

	@Override
	public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int id = rs.getInt(columnIndex);
//		if (id == 1) {
//			return SexEnum.Male;
//		}
//		return SexEnum.Female;
		return SexEnum.getSexEnumById(id);
	}

	@Override
	public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int id = cs.getInt(columnIndex);
//		if (id == 1) {
//			return SexEnum.Male;
//		}
//		return SexEnum.Female;
		return SexEnum.getSexEnumById(id);
	}

}
