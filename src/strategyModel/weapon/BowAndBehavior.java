package strategyModel.weapon;

public class BowAndBehavior implements WeaponBehavior {

	@Override
	public void userWeapon() {
		System.out.println("使用弓箭远程攻击");
	}

}
