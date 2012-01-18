package strategyModel.weapon;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void userWeapon() {
		System.out.println("使用匕首突刺");
	}

}
