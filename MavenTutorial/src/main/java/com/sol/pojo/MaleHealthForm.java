package com.sol.pojo;

import org.apache.ibatis.type.Alias;

@Alias("male")
public class MaleHealthForm extends HealthForm {
	private String prostate;

	public String getProstate() {
		return prostate;
	}

	public void setProstate(String prostate) {
		this.prostate = prostate;
	}
	
	}
