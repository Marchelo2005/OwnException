package com.example.ownexception;

public class ProductWithoutExistenceException extends Exception {
    public ProductWithoutExistenceException(String mensaje) {
        super(mensaje);
    }
}
