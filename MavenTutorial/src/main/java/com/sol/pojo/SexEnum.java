package com.sol.pojo;

public enum SexEnum {
	
	Male(1, "Male", new MaleHealthForm()), Female(0, "Famale", new FemaleHealthForm());
	private int sexid;
	private String sexName;
	private HealthForm healthForm;
	
	private SexEnum(int sexid, String sexName, HealthForm healthForm) {
		this.sexid = sexid;
		this.sexName = sexName;
		this.healthForm = healthForm;
	}
	
	public static SexEnum getSexEnumById(int id) {
		
			if(id == 1) {
				return SexEnum.Male;
			} else {
				return SexEnum.Female;
			}
		
		
		
	}
	public int getSexid() {
		return sexid;
	}

	public void setSexid(int sexid) {
		this.sexid = sexid;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public HealthForm getHealthForm() {
		return healthForm;
	}

	public void setHealthForm(HealthForm healthForm) {
		this.healthForm = healthForm;
	} 
	
}
