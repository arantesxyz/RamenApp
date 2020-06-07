package puc.es.pm.ramenapp.entities.impl;

import puc.es.pm.ramenapp.entities.Item;
import puc.es.pm.ramenapp.entities.Pedido;
import puc.es.pm.ramenapp.entities.Prato;
import puc.es.pm.ramenapp.users.Cliente;

import java.util.HashSet;
import java.util.Set;

public class CraftPedido implements Pedido {
    // Em produção isso deveria ser taréfa do banco de dados.
    private static int count = 0;

    private int id;
    private Cliente cliente;
    private Set<Prato> pratos;
    private Set<Item> bebidas;

    public CraftPedido(Cliente cliente) {
        this.id = count++;
        this.cliente = cliente;
        this.pratos = new HashSet<>();
        this.bebidas = new HashSet<>();
    }

    public void addPrato(Prato prato) {
        pratos.add(prato);
    }

    public void removePrato(Prato prato) {
        pratos.remove(prato);
    }

    public void addBebida(Item bebida) {
        bebidas.add(bebida);
    }

    public void removeBebida(Item bebida) {
        bebidas.remove(bebida);
    }

    public double getTotal() {
        double totalPratos = pratos.stream().mapToDouble(Prato::getTotal).sum();
        double totalBebidas = bebidas.stream().mapToDouble(Item::getPreco).sum();

        return totalPratos + totalBebidas;
    }

    // Observable
    public void pronto() {
        cliente.notificar(this);
    }

    public int getId() {
        return id;
    }

}