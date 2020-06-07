package puc.es.pm.ramenapp.entities;

public interface Pedido {
    void addPrato(Prato prato);
    void removePrato(Prato prato);
    void addBebida(Item bebida);
    void removeBebida(Item bebida);
    double getTotal();
    void pronto();
    int getId();
}
