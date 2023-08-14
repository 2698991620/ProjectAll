package com.xja.service;

import com.xja.dao.TrainDAO;
import com.xja.domain.Train;

/**
 * 项目名称: com.xja.service <br/>
 * 文件名称: TrainService <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/1:20:00 <br/>
 * 包名：com.xja.service
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class TrainService {
	private TrainDAO trainDAO = new TrainDAO();
	
	public void buyTrain(String name) throws Exception {
		Train train = trainDAO.findByEmpty();
		if (train == null) {
			throw new Exception("火车票已经售完");
		} else {
			System.out.println(Thread.currentThread().getName() + "买"
					+ train.getTrainId());
			train.setName(name);// 表示售出给name
		}
	}
	
}
