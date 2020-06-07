package puc.es.pm.ramenapp.items;

import puc.es.pm.ramenapp.entities.Item;
import puc.es.pm.ramenapp.entities.impl.CraftItem;

public enum Tamanho {
    PEQUENO("Pequeno", 9.9),
    MEDIO("Medio", 12.9),
    GRANDE("Grande", 15.9);

    private String descricao;
    private double preco;

    Tamanho(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Item wrap() {
        return new CraftItem(descricao, preco);
    }
}
