package threads;

/**
 * 项目名称: threads <br/>
 * 文件名称: Threads <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/1:10:24 <br/>
 * 包名：threads
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class Threads {
	public static void main(String[] args) {
		Thread01 t01 = new Thread01();
		
		ThreadRunnable threadRunnable = new ThreadRunnable();
		Thread thread = new Thread(threadRunnable);
		
		thread.start();
		t01.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main:"+i);
		}
	}
}
