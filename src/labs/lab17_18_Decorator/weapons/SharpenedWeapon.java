package labs.lab17_18_Decorator.weapons;

public class SharpenedWeapon extends WeaponDecorator {
    public SharpenedWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int damage() {
        return weapon.damage() + 3;
    }

    @Override
    public String description() {
        return weapon.description() + ", Sharpened";
    }
}
