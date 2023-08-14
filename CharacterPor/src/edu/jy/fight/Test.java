package edu.jy.fight;

import edu.jy.character.Character;
import edu.jy.weaponBehavior.WeaponBehavior;

import java.util.Scanner;

/**
 * 项目名称: edu.jy.fight <br/>
 * 文件名称: Test <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/7/14:19:59 <br/>
 * 包名：edu.jy.fight
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class Test {
	public static void main(String[] args) {
		while (true){
			String s = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("请选择人物：");;
			System.out.println("1、国王");;
			System.out.println("2、皇后");;
			System.out.println("3、骑士");;
			System.out.println("4、妖怪");
			System.out.println("5、退出");
			int i = sc.nextInt();
			if (i==5){
				break;
			}
			switch (i){
				case 1:
					s= Character.Fight(Character.KING);
					break;
				case 2:
					s=Character.Fight(Character.QUEEN);
					break;
				case 3:
					s=Character.Fight(Character.KNIGHT);
					break;
				case 4:
					s=Character.Fight(Character.TROLL);
					break;
			}
			System.out.println("请选择攻击方式：");;
			System.out.println("1、用剑砍");;
			System.out.println("2、用匕首刺");;
			System.out.println("3、用斧头剁");;
			System.out.println("4、用弓箭射");
			int j = sc.nextInt();
			switch (j){
				case 1:
					System.out.println(s+WeaponBehavior.Fight(WeaponBehavior.SWORD));
					break;
				case 2:
					System.out.println(s+WeaponBehavior.Fight(WeaponBehavior.KNIFE));
					break;
				case 3:
					System.out.println(s+WeaponBehavior.Fight(WeaponBehavior.AXE));
					break;
				case 4:
					System.out.println(s+WeaponBehavior.Fight(WeaponBehavior.BOWADARROW));
					break;
			}
		}
	}
}
