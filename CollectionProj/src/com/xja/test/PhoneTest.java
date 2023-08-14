package com.xja.test;

import com.xja.comparator.PhoneCommentsDescComparator;
import com.xja.comparator.PhonePriceDescComparator;
import com.xja.comparator.PhoneSalesDescComparator;
import com.xja.domain.Phone;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 项目名称: com.xja.test <br/>
 * 文件名称: PhoneTest <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/7/26:19:52 <br/>
 * 包名：com.xja.test
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class PhoneTest {
	public static void main(String[] args) {
		ArrayList<Phone> phones = new ArrayList<>();
		phones.add(new Phone(1,"苹果",12000,458456,48));
		phones.add(new Phone(2,"华为",9000,492488,66));
		phones.add(new Phone(3,"oppe",5000,489465,77));
		phones.add(new Phone(4,"vivo",6000,478456,70));
		Collections.sort(phones,new PhoneCommentsDescComparator());
		for (Phone phone : phones) {
			System.out.println(phone);
		}
		System.out.println();
		Collections.sort(phones,new PhonePriceDescComparator());
		for (Phone phone : phones) {
			System.out.println(phone);
		}
		System.out.println();
		Collections.sort(phones,new PhoneSalesDescComparator());
		for (Phone phone : phones) {
			System.out.println(phone);
		}
	}
}
