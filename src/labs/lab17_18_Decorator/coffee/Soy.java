package labs.lab17_18_Decorator.coffee;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        // TODO: Delegate to beverage.getDescription(), then append ", Soy".
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        // TODO: Delegate to beverage.cost(), then add 0.15.
        return beverage.cost() + 0.15;
    }
}
