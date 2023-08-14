package com.xja.service.impl;

/**
 * 项目名称: com.xja.service.impl <br/>
 * 文件名称: CompareToServiceImpl <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/7/26:8:35 <br/>
 * 包名：com.xja.service.impl
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 * ‘
 */
public enum CompareToServiceImpl  implements Comparable<CompareToServiceImpl> {
	private int id;
	private String name;
	public CompareToServiceImpl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(CompareToServiceImpl o) {
		return -(this.id - o.id);
	}
	
}
