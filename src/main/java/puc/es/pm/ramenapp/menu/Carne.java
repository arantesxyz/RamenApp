package puc.es.pm.ramenapp.menu;

import puc.es.pm.ramenapp.entities.Item;
import puc.es.pm.ramenapp.entities.impl.CraftItem;

public enum Carne {
    VEGANO("Vegano", 3.9),
    PORCO("Porco", 5.9),
    BOI("Boi", 7.9);

    private String descricao;
    private double preco;

    Carne(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Item wrap() {
        return new CraftItem(descricao, preco);
    }
}
