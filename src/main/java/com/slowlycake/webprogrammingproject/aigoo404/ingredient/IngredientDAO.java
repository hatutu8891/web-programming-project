package com.slowlycake.webprogrammingproject.aigoo404.ingredient;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

import java.util.List;

public class IngredientDAO {
    private static final String SELECT_ALL_INGREDIENT =
            "select ing.id, ing.name," +
                    "inv.stockQuantity, inv.reqQuantity " +
                    "from ingredients ing " +
                    "join inventory inv on inv.ingID = ing.id;";
    private static final String INSERT =
            "INSERT INTO ingredients (name) VALUES (:name); " +
                    "INSERT INTO inventory (ingID, stockQuantity, reqQuantity) VALUES (LAST_INSERT_ID(), :stockQuantity, :reqQuantity);";

    private static final String UPDATE =
            "UPDATE inventory SET stockQuantity = :stockQuantity, reqQuantity = :reqQuantity WHERE ingID = :id;";

    private static final String DELETE =
            "DELETE FROM inventory WHERE ingID = :id; " +
                    "DELETE FROM ingredients WHERE id = :id;";

    public List<Ingredient> getAllIngredients() {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery(SELECT_ALL_INGREDIENT)
                        .mapToBean(Ingredient.class)
                        .list()
        );
    }

    public void addIngredient(String name, int stockQuantity, int reqQuantity) {
        JDBIConnect.get().useHandle(handle ->
                handle.createUpdate(INSERT)
                        .bind("name", name)
                        .bind("stockQuantity", stockQuantity)
                        .bind("reqQuantity", reqQuantity)
                        .execute()
        );
    }

    public void updateIngredient(int id, int stockQuantity, int reqQuantity) {
        JDBIConnect.get().useHandle(handle ->
                handle.createUpdate(UPDATE)
                        .bind("id", id)
                        .bind("stockQuantity", stockQuantity)
                        .bind("reqQuantity", reqQuantity)
                        .execute()
        );
    }

    public void deleteIngredient(int id) {
        JDBIConnect.get().useHandle(handle ->
                handle.createUpdate(DELETE)
                        .bind("id", id)
                        .execute()
        );
    }
}
