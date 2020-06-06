package puc.es.pm.solid.entities.impl;

import puc.es.pm.solid.entities.Prato;
import puc.es.pm.solid.entities.items.Carne;
import puc.es.pm.solid.entities.items.Extra;
import puc.es.pm.solid.entities.items.Tamanho;

import java.util.Set;

public class CraftPrato implements Prato {
    private Tamanho tamanho;
    private Carne carne;
    private Set<Extra> extras;

    private int quantidade;

    public CraftPrato(Tamanho tamanho, Carne carne, Set<Extra> extras, int quantidade) {
        this.tamanho = tamanho;
        this.carne = carne;
        this.extras = extras;
        this.quantidade = quantidade;
    }
}
