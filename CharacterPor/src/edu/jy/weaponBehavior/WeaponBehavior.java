package edu.jy.weaponBehavior;

public enum WeaponBehavior {
	SWORD,KNIFE,AXE,BOWADARROW;
	
	public static String Fight(WeaponBehavior weaponBehavior){
		switch (weaponBehavior){
			case SWORD:
				return "用剑砍";
			case KNIFE:
				  return "用匕首刺";
			case AXE:
				return "用斧头剁";
			case BOWADARROW:
				return "用弓箭射" ;
		}
		return null;
	}
}
