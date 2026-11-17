package labs.lab17_18_Decorator.weapons;

import java.util.Objects;

public abstract class WeaponDecorator implements Weapon {
    protected final Weapon weapon;

    protected WeaponDecorator(Weapon weapon) {
        this.weapon = Objects.requireNonNull(weapon, "weapon");
    }
}
