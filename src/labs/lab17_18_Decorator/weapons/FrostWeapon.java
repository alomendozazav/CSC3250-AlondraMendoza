package labs.lab17_18_Decorator.weapons;

public class FrostWeapon extends WeaponDecorator {
    public FrostWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int damage() {
        // TODO: Delegate to weapon.damage(), then add 2.
        return weapon.damage() + 2;
    }

    @Override
    public String description() {
        // TODO: Delegate to weapon.description(), then append ", Frost".
        return weapon.description() + ", Frost";
    }
}
