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
		
		Character user = new King();
		//调用者选择用哪种武器攻击（这个选择就是给出具体的策略）
		user.setWeapon(weaponList.get(1));
		user.fight();
		//武器的攻击
		user.runweapon();
	}

}
