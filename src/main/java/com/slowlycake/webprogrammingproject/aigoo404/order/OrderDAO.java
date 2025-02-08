package com.slowlycake.webprogrammingproject.aigoo404.order;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

import java.util.List;

public class OrderDAO {
    private static final String GET_ALL_ORDER =
            "SELECT o.id, u.name as username, o.date, o.price, o.status " +
                    "FROM orders o " +
                    "JOIN users u ON o.uID = u.id;";

    public List<Order> getAllOrders() {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery(GET_ALL_ORDER)
                        .mapToBean(Order.class)
                        .list()
        );
    }
}
