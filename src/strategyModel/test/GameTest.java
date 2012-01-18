package strategyModel.test;
import java.util.ArrayList;
import java.util.List;

import strategyModel.user.Character;
import strategyModel.user.King;
import strategyModel.weapon.AxeBehavior;
import strategyModel.weapon.BowAndBehavior;
import strategyModel.weapon.KnifeBehavior;
import strategyModel.weapon.WeaponBehavior;

public class GameTest {

	/**
	 * @param args
	 * 选择一个角色，使用攻击时选用某种武器
	 */
	public static void main(String[] args) {
		List<WeaponBehavior> weaponList = new ArrayList<WeaponBehavior>();
		weaponList.add(new AxeBehavior());
		weaponList.add(new BowAndBehavior());
		weaponList.add(new KnifeBehavior());
		
		//选择角色，利用多态将角色的引用指向具体角色的实现
		Character user = new King();
		
		//调用者给出具体的策略，要使用哪种武器的攻击方式
		user.setWeapon(weaponList.get(1));
		
		//此时指向的是King的攻击动作
		user.fight();
		
		//武器的攻击
		user.runweapon();
	}

}
