package puc.es.pm.solid.entities.impl;

import puc.es.pm.solid.entities.items.Extra;

public class CraftExtra extends CraftItem implements Extra {
    private int amount;

    public CraftExtra(String descricao, double preco, int amount) {
        super(descricao, preco);
        this.amount = amount;
    }

    public int getAmount() {
        return 0;
    }

    public void setAmount(int amount) {

    }
}
