package es.uniovi.ds.lab.google.maps;

public interface Marker {
    Coordinates getCoordinates();

    String handleShortPress();

    void handleLongPress();
}
