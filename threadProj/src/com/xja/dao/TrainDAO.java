package com.xja.dao;

import com.xja.domain.Train;

/**
 * 项目名称: com.xja.dao <br/>
 * 文件名称: TrainDAO <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/1:19:59 <br/>
 * 包名：com.xja.dao
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class TrainDAO {
	public Train findByEmpty(){
		for (Train train : Train.TRAIN_LIST) {
			if(train.getName()==null){
				return train;
			}
		}
		return null;
	}
	
}
