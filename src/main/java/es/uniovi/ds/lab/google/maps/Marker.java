package es.uniovi.ds.lab.google.maps;

public interface Marker {
    Coordinates getCoordinates();

    String getInfo();

    void handleLongPress();
}
