package com.a5a5lab.fapp.snsmessanger;

public class SnsMessangerDto {
	     
	private String seq;
	private Integer main;	
	private String type;	
	private String snsAddress;	
	private Integer contact_seq;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getMain() {
		return main;
	}
	public void setMain(Integer main) {
		this.main = main;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSnsAddress() {
		return snsAddress;
	}
	public void setSnsAddress(String snsAddress) {
		this.snsAddress = snsAddress;
	}
	public Integer getContact_seq() {
		return contact_seq;
	}
	public void setContact_seq(Integer contact_seq) {
		this.contact_seq = contact_seq;
	}	
	
}
