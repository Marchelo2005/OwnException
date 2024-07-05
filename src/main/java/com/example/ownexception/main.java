package com.example.ownexception;

public class main {
    public static void sellProduct() throws ProductWithoutExistenceException {

        int cantidadEnStock = 0;
        if (cantidadEnStock <= 0) {
            throw new ProductWithoutExistenceException("El producto no tiene existencia");
        }
        System.out.println("Producto vendido exitosamente");
    }

}
