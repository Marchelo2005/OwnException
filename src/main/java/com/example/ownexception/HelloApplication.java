package com.example.ownexception;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import static com.example.ownexception.main.sellProduct;

public class HelloApplication  {
   
    public static void main(String[] args) {
        try {
            sellProduct();
        } catch (ProductWithoutExistenceException e) {
            System.out.println("Se lanzó la excepción: " + e.getMessage());
        }

    }
}