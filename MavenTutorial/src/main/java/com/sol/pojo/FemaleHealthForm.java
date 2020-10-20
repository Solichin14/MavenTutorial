package com.sol.pojo;

import org.apache.ibatis.type.Alias;

@Alias("female")
public class FemaleHealthForm extends HealthForm {
	private String uterus;

	public String getUterus() {
		return uterus;
	}

	public void setUterus(String uterus) {
		this.uterus = uterus;
	}
	
	
}
