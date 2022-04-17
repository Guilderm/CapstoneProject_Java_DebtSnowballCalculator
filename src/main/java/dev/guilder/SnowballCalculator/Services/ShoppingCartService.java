
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.ShoppingCart;
import java.util.List;


public interface ShoppingCartService {
    public List<ShoppingCart> getAllShoppingCarts();
    public ShoppingCart getShoppingCartById(long shoppingCartId);
    public void saveitems(ShoppingCart shoppingCart);
    public void deleteitems(long shoppingCartId);
}
