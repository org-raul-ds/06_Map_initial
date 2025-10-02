/**
 * # IMPORTANT: The code provided for this exercise is the minimum necessary to understand
 * the exercise and should NEVER be taken as an example of proper use of exceptions, assertions,
 * and tests. All of the above, which should be done in a real program, has been intentionally omitted
 * to simplify the exercise.
 */

package es.uniovi.ds.lab.main;

import es.uniovi.ds.lab.database.Database;
import es.uniovi.ds.lab.google.maps.Map;
import es.uniovi.ds.lab.model.*;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        Map map = new Map();

        // 1. Add elements to the map
        System.out.println("\n 1. Adding markers to the map");

        for (Monument monument : database.selectMonuments()) {
            // map.add(monument);
        }

        for (Photo photo : database.selectPhotos()) {
            // map.add(photo);
        }

        for (Restaurant restaurant : database.selectRestaurants()) {
            // map.add(restaurant);
        }

        // 2. Draw the map with the markers for the added elements
        System.out.println("\n 2. Drawing the map with markers");
        map.draw();

        // 3. User briefly presses the screen to receive information about each element
        System.out.println("\n 3. Short press on each element: information in tooltip");
        map.handleShortPress(11, 11); // Pressed on Monument: Name and author of the monument (coliseum)
        map.handleShortPress(21, 21); // Pressed on Photo: User who uploaded it and photo description
        map.handleShortPress(31, 31); // Pressed on Restaurant: Name and reservation phone

        // 4. User long presses a marker to open an element
        System.out.println("\n 4. Long press on each element: open the element");
        map.handleLongPress(11, 11); // Pressed on Monument: Navigate to the coliseum with GPS
        map.handleLongPress(21, 21); // Pressed on Photo: Download photo
        map.handleLongPress(31, 31); // Pressed on Restaurant: Call the restaurant

    }

}
