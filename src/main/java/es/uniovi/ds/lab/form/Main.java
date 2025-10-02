package es.uniovi.ds.lab.form;

import es.uniovi.ds.lab.google.maps.Coordinates;
import es.uniovi.ds.lab.model.*;

public class Main {

    public static void main(String[] args) {

        Monument monument = new Monument("Coliseum", "Vespasian", "Coliseum Avenue 1. Rome");
        Restaurant restaurant = new Restaurant("The Fat Gladiator", "At the end of the forum to the right",
                "555 123 456");
        Photo photo = new Photo("Raul", "A dog biting a tourist", new Coordinates(40, 40));

        MiniForm form = new MiniForm();
        form.requestInput(monument);

        // Task 1. Also edit restaurant. Allow editing the name and address.

        // Task 2. Also edit photo. Allow editing the user and description.

        // NOTE: To simplify, assume only two fields will be requested in every form.
    }

}
