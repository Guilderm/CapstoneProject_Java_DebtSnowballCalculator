package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.ShoppingCart;

import java.util.List;


public interface ShoppingCartService {
    List<ShoppingCart> getAllShoppingCarts();

    ShoppingCart getShoppingCartById(long shoppingCartId);

    void saveitems(ShoppingCart shoppingCart);

    void deleteitems(long shoppingCartId);
}
