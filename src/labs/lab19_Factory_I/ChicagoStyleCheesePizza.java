package labs.lab19_Factory_I;

public final class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super("Chicago Style Cheese Pizza");
    }

    @Override
    public void cut() {
        // TODO 19B: record exactly one step: "cut: square slices".
        // This replaces the inherited cut implementation.
        recordStep("cut: square slices");
    }
}
