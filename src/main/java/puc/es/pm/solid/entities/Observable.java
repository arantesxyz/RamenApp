package puc.es.pm.solid.entities;

import java.util.Observer;

public interface Observable {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
