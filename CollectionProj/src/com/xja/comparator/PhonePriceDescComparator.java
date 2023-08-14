package com.xja.comparator;

import com.xja.domain.Phone;

import java.util.Comparator;

/**
 * 项目名称: com.xja.comparator <br/>
 * 文件名称: PhonePriceDescComparator <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/7/26:19:45 <br/>
 * 包名：com.xja.comparator
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class PhonePriceDescComparator implements Comparator<Phone> {
	
	@Override
	public int compare(Phone o1, Phone o2) {
		if (o1.getPhonePrice()>o2.getPhonePrice()){
			return 1;
		}else {
			return -1;
		}
	}
	
}
