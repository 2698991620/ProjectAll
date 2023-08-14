package com.xja.runnables;

import com.xja.domain.Train;
import com.xja.service.TrainService;

/**
 * 项目名称: com.xja.runnables <br/>
 * 文件名称: TrainRunnable <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/1:20:01 <br/>
 * 包名：com.xja.runnables
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class TrainRunnable implements Runnable{
	private TrainService trainBIZ;
	public TrainRunnable(TrainService trainBIZ) {
		this.trainBIZ = trainBIZ;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				synchronized (Train.TRAIN_LIST) {
					trainBIZ.buyTrain(Thread.currentThread().getName());
				}
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println(Thread.currentThread().getName() + "售完");
				e.printStackTrace();
				break;
			}
		}
	}
	
}
