package com.jeessicats.course.entities.pk;

import com.jeessicats.course.entities.Order;
import com.jeessicats.course.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne // Correção: @ManyToOne ao invés de @ManyToMany
    @JoinColumn(name = "order_id") // Chave estrangeira para Order
    private Order order;

    @ManyToOne // Correção: @ManyToOne ao invés de @ManyToMany
    @JoinColumn(name = "product_id") // Chave estrangeira para Product
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}

