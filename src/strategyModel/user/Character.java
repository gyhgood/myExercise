package strategyModel.user;

import strategyModel.weapon.WeaponBehavior;

/**
 * 角色的基类
 *
 */

public abstract class Character {

	//声明一个接口
	WeaponBehavior weapon;
	
	//提供一个生成切换武器策略的方法
	public void setWeapon(WeaponBehavior w){
		this.weapon = w;
	}
	//战斗方法
	public void fight(){};
	//武器攻击
	public void runweapon(){
		weapon.userWeapon();
	}
}
