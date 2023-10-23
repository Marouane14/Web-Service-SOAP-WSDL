package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.classes.BanqueService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8087/", new BanqueService());
        System.out.println("Web Service déployé sur http://0.0.0.0:8087/");
    }
}