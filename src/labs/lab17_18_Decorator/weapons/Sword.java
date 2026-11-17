package labs.lab17_18_Decorator.weapons;

public class Sword implements Weapon {
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String description() {
        return "Sword";
    }
}
