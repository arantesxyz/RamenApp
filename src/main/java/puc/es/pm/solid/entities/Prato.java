package puc.es.pm.solid.entities;

import puc.es.pm.solid.entities.items.Carne;
import puc.es.pm.solid.entities.items.Extra;
import puc.es.pm.solid.entities.items.Tamanho;

import java.util.Set;

public class Prato {
    private Tamanho tamanho;
    private Carne carne;
    private Set<Extra> extras;

    private int quantidade;

    public Prato(Tamanho tamanho, Carne carne, Set<Extra> extras, int quantidade) {
        this.tamanho = tamanho;
        this.carne = carne;
        this.extras = extras;
        this.quantidade = quantidade;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Carne getCarne() {
        return carne;
    }

    public void setCarne(Carne carne) {
        this.carne = carne;
    }

    public Set<Extra> getExtras() {
        return extras;
    }

    public void setExtras(Set<Extra> extras) {
        this.extras = extras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
