package labs.lab17_18_Decorator.weapons;

public class FlamingWeapon extends WeaponDecorator {
    public FlamingWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int damage() {
        // TODO: Delegate to weapon.damage(), then add 5.
        return weapon.damage() + 5;
    }

    @Override
    public String description() {
        // TODO: Delegate to weapon.description(), then append ", Flaming".
        return weapon.description() + ", Flaming";
    }
}
