package puc.es.pm.ramenapp.items;

import puc.es.pm.ramenapp.entities.impl.CraftExtra;

public enum Extra {
    CARNE("Carne Extra", 4),
    CREME_ALHO("Crème alho", 1.5),
    CHILLI("Chilli", 2.5),
    CROUTONS("Croutons", 2),
    SHITAKE("Shitake", 6.9),
    TOFU("Tofu", 2.7);

    private String descricao;
    private double preco;

    Extra(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public puc.es.pm.ramenapp.entities.Extra wrap(int quantidade) {
        return new CraftExtra(descricao, preco, quantidade);
    }
}
