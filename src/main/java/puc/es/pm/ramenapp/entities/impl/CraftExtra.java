package puc.es.pm.ramenapp.entities.impl;

import puc.es.pm.ramenapp.entities.Extra;

public class CraftExtra extends CraftItem implements Extra {
    private int amount;

    public CraftExtra(String descricao, double preco, int amount) {
        super(descricao, preco);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * amount;
    }
}
