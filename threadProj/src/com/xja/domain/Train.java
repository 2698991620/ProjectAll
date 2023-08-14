package com.xja.domain;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称: com.xja.domain <br/>
 * 文件名称: Train <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/1:19:58 <br/>
 * 包名：com.xja.domain
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class Train{
	//编号
	private int trainId;
	//购票人姓名，现在放售票窗口名称就可以
	private String name;
	public static final List<Train> TRAIN_LIST = new ArrayList<Train>();
	static{
		for (int i = 1; i<=10; i++) {
			TRAIN_LIST.add(new Train(i));
		}
	}
	public Train(int trainId) {
		super();
		this.trainId = trainId;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
