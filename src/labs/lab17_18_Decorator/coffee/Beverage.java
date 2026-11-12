package labs.lab17_18_Decorator.coffee;

/** Common contract for a beverage and every condiment wrapper. */
public abstract class Beverage {
    public abstract String getDescription();
    public abstract double cost();
}
