package labs.lab19_Factory_I;

/** Complete TODO 19A by following the finished NYPizzaStore example. */
public final class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        // TODO 19A: "cheese" -> new ChicagoStyleCheesePizza().
        //           "veggie" -> new ChicagoStyleVeggiePizza().
        //           Any other value -> throw IllegalArgumentException.
        // Return a product here. The inherited orderPizza runs its steps.
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        }
        throw new IllegalArgumentException("Unsupported pizza type: " + type);
    }
}
