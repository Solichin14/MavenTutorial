package com.sol.pojo;

import org.apache.ibatis.type.Alias;

@Alias("paramrole")
public class ParamRole {
	private String name;
	private String myNote;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMyNote() {
		return myNote;
	}
	public void setMyNote(String myNote) {
		this.myNote = myNote;
	}
	

}
