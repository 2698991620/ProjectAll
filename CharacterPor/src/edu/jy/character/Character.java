package edu.jy.character;

/**
 * 项目名称: edu.jy.character <br/>
 * 文件名称: Character <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/7/14:19:31 <br/>
 * 包名：edu.jy.character
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public enum Character {
	KING,QUEEN,KNIGHT,TROLL;
	public static String Fight(Character character){
		switch (character){
			case KING:
				return "国王";
			case QUEEN:
				return  "皇后";
			case KNIGHT:
				return  "骑士";
			case TROLL:
				return "妖怪";
		}
		return null;
	}
}
