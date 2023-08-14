package threads;

/**
 * 项目名称: threads <br/>
 * 文件名称: ThreadRunnable <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/1:11:06 <br/>
 * 包名：threads
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class ThreadRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("ThreadRunnable:"+i);
		}
	}
}
