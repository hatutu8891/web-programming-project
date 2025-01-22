package com.slowlycake.webprogrammingproject.dao.cart;


import com.slowlycake.webprogrammingproject.products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Cart {
    Map<Integer, com.slowlycake.webprogrammingproject.dao.cart.CartProduct> data = new HashMap<>();

    public boolean add(Product p) {
        if (data.containsKey(p.getId())) {
            return update(p.getId(), data.get(p.getId()).getQuantity() + 1);
        }
        data.put(p.getId(), convert(p));
        return true;
    }

    public boolean update(int id, int quantity) {
        if (!data.containsKey(id)) return false;
        CartProduct cartProduct = data.get(id);
        if (quantity < 1) return false;
        cartProduct.setQuantity(quantity);
        data.put(id, cartProduct);
        return true;

    }

    public boolean remove(int id) {
        return data.remove(id) != null;
    }

    public List<CartProduct> getList() {
        return new ArrayList<>(data.values());
    }

    public int getTotalQuantity() {
        AtomicInteger i = new AtomicInteger();
        data.values().forEach(cp -> i.addAndGet(cp.getQuantity()));
        return i.get();
    }

    public double getTotal() {
        AtomicReference<Double> i = new AtomicReference<>((double) 0);
        data.values().forEach(cp-> i.updateAndGet(v -> (double) (v + (cp.getQuantity() * cp.getPrice()))));
        return i.get();
    }

    private CartProduct convert(Product p) {
        com.slowlycake.webprogrammingproject.dao.cart.CartProduct re = new CartProduct();
        re.setId(p.getId());
        re.setTitle(p.getName());
        re.setPrice(p.getPrice());
        re.setImg(p.getImg());
        re.setQuantity(1);
        return re;
    }

}
