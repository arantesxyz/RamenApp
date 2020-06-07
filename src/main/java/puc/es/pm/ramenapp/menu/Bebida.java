package puc.es.pm.ramenapp.menu;

import puc.es.pm.ramenapp.entities.Item;
import puc.es.pm.ramenapp.entities.impl.CraftItem;

public enum Bebida {
    REFRI("Refrigerante", 5.9),
    OCHA_VERDE("O-Cha (Verde)", 3.9),
    OCHA_PRETO("O-Cha (Preto)", 0);

    private String descricao;
    private double preco;

    Bebida(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Item wrap() {
        return new CraftItem(descricao, preco);
    }
}
