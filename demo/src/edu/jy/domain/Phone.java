package edu.jy.domain;

/**
 * 14.6 练习：编写一个手机类。属性有如下几项内容：编号，名称，类型，价格，评价数量
 */
public class Phone {
	private Integer phoneId;
	private String phoneName;
	private String phoneType;
	private Double phonePrice;
	private Integer phoneEval;
	
	@Override
	public String toString() {
		return "Phone{" +
				"phoneId=" + phoneId +
				", phoneName='" + phoneName + '\'' +
				", phoneType='" + phoneType + '\'' +
				", phonePrice=" + phonePrice +
				", phoneEval=" + phoneEval +
				'}';
	}
	
	public Integer getPhoneId() {
		return phoneId;
	}
	
	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}
	
	public String getPhoneName() {
		return phoneName;
	}
	
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	
	public String getPhoneType() {
		return phoneType;
	}
	
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	public Double getPhonePrice() {
		return phonePrice;
	}
	
	public void setPhonePrice(Double phonePrice) {
		this.phonePrice = phonePrice;
	}
	
	public Integer getPhoneEval() {
		return phoneEval;
	}
	
	public void setPhoneEval(Integer phoneEval) {
		this.phoneEval = phoneEval;
	}
}
