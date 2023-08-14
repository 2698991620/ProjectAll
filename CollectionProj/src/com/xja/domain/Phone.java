package com.xja.domain;

/**
 * 项目名称: com.xja.domain <br/>
 * 文件名称: Phone <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/7/26:19:38 <br/>
 * 包名：com.xja.domain
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class Phone {
//	编号
	private Integer phoneId;
	
//	名称
	private String phoneName;
	
//	价格
	private Integer phonePrice;
	
//	销量
	private Integer phoneSales;
	
//	评论
	private Integer phoneComments;
	
	
	
	public Phone() {
	}
	
	public Phone(Integer phoneId, String phoneName, Integer phonePrice, Integer phoneSales, Integer phoneComments) {
		this.phoneId = phoneId;
		this.phoneName = phoneName;
		this.phonePrice = phonePrice;
		this.phoneSales = phoneSales;
		this.phoneComments = phoneComments;
	}
	
	@Override
	public String toString() {
		return "Phone{" +
				"phoneId=" + phoneId +
				", phoneName='" + phoneName + '\'' +
				", phonePrice=" + phonePrice +
				", phoneSales=" + phoneSales +
				", phoneComments=" + phoneComments +
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
	
	public Integer getPhonePrice() {
		return phonePrice;
	}
	
	public void setPhonePrice(Integer phonePrice) {
		this.phonePrice = phonePrice;
	}
	
	public Integer getPhoneSales() {
		return phoneSales;
	}
	
	public void setPhoneSales(Integer phoneSales) {
		this.phoneSales = phoneSales;
	}
	
	public Integer getPhoneComments() {
		return phoneComments;
	}
	
	public void setPhoneComments(Integer phoneComments) {
		this.phoneComments = phoneComments;
	}
}
