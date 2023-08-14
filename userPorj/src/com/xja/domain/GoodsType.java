package com.xja.domain;

/**
 * 项目名称: com.xja <br/>
 * 文件名称: GoodsType <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/11:16:18 <br/>
 * 包名：com.xja
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class GoodsType {
	private Integer type_id;
	private String type_name;
	private Integer type_pid;
	private Integer type_lv;
	private String  type_path;
	
	public GoodsType() {
	}
	
	public GoodsType(Integer type_id, String type_name, Integer type_pid, Integer type_lv, String type_path) {
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_pid = type_pid;
		this.type_lv = type_lv;
		this.type_path = type_path;
	}
//	Incorrect method 'java.lang.Integer get Type_id() { return type_id; }'
	
	public Integer getType_id() {
		return type_id;
	}
	
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	
	public String getType_name() {
		return type_name;
	}
	
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	public Integer getType_pid() {
		return type_pid;
	}
	
	public void setType_pid(Integer type_pid) {
		this.type_pid = type_pid;
	}
	
	public Integer getType_lv() {
		return type_lv;
	}
	
	public void setType_lv(Integer type_lv) {
		this.type_lv = type_lv;
	}
	
	public String getType_path() {
		return type_path;
	}
	
	public void setType_path(String type_path) {
		this.type_path = type_path;
	}
	
	
}
