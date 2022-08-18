package com.record.microservice.model;

public class Record {
	


	private Long cid;
	private String email;
	private String companyName;
	private Long eId;
	
	
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Record(Long cid, String email, String companyName, Long eId) {
		super();
		this.cid = cid;
		this.email = email;
		this.companyName = companyName;
		this.eId = eId;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	 


}
