package labs.lab06;

public class CheckoutService {

  public double checkout(ShoppingCart cart) {

    if (cart == null) {
      throw new IllegalArgumentException(
              "Shopping cart cannot be null."
      );
    }

    // TODO 6:
    // Ask the ShoppingCart for its subtotal
    // and return it.
    double subtotal = cart.getSubtotal();

    return subtotal;
  }
}