package puc.es.pm.ramenapp.entities.impl;

import puc.es.pm.ramenapp.entities.Item;
import puc.es.pm.ramenapp.entities.Prato;
import puc.es.pm.ramenapp.entities.Extra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CraftPrato implements Prato {
    private Item tamanho;
    private Item carne;
    private Set<Extra> extras;

    public CraftPrato(Item tamanho, Item carne, Extra... extras) {
        this.tamanho = tamanho;
        this.carne = carne;
        this.extras = new HashSet<>(Arrays.asList(extras));
    }

    @Override
    public double getTotal() {
        return tamanho.getPreco() + carne.getPreco() + extras.stream().mapToDouble(Extra::getPreco).sum();
    }
}