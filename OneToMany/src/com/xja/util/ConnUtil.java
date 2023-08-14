package com.xja.util;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 项目名称: com.xja.util <br/>
 * 文件名称: ConnUtil <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/12:14:11 <br/>
 * 包名：com.xja.util
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class ConnUtil {
	//连接池
	private static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();
	private static DataSource ds
}
