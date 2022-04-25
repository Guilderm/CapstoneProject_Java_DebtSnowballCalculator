package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.ShoppingCart;
import dev.guilder.SnowballCalculator.Repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ShoppingCart> getAllShoppingCarts() {
        return (List<ShoppingCart>) shoppingCartRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ShoppingCart getShoppingCartById(long shoppingCartId) {
        return shoppingCartRepository.findById(shoppingCartId).orElse(null);
    }

    @Override
    @Transactional
    public void saveitems(ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    @Transactional
    public void deleteitems(long shoppingCartId) {
        shoppingCartRepository.deleteById(shoppingCartId);
    }
}
