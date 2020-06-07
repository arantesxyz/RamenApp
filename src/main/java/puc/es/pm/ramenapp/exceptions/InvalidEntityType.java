package puc.es.pm.ramenapp.exceptions;

public class InvalidEntityType extends Exception {
    public InvalidEntityType() {
        super("A entidade recebida é diferente da esperada.");
    }
}
