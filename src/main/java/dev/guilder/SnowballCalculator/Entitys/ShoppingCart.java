package dev.guilder.SnowballCalculator.Entitys;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shoppingCartId;

    public long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }
}
