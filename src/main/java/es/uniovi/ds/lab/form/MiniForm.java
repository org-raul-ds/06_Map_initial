package es.uniovi.ds.lab.form;

import java.io.*;

import es.uniovi.ds.lab.model.Monument;

/* Basic form to use when you only want to request two values about something */
public class MiniForm {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public void requestInput(Monument monument) {

        System.out.println("Editing Monument.");

        System.out.println("Current values:");
        printMonument(monument);

        System.out.println("Enter new values (leave blank to keep current value):");
        System.out.print("- Author: ");
        String text = getLine();
        if (!text.isEmpty())
            monument.setAuthor(text);

        System.out.print("- Address: ");
        text = getLine();
        if (!text.isEmpty())
            monument.setAddress(text);

        System.out.println("Final values:");
        printMonument(monument);
    }

    private void printMonument(Monument monument) {
        System.out.println("- Author = " + monument.getAuthor());
        System.out.println("- Address = " + monument.getAddress());
    }

    private String getLine() {
        do {
            try {
                return console.readLine();
            } catch (IOException ex) {
                System.out.println("Read error. Please try again.");
            }
        } while (true);
    }

}
