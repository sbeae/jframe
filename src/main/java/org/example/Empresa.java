package org.example;

import java.util.HashMap;

public enum Empresa {
    INSTANCE;

    private HashMap<String, DetallesCliente> dataClientes = new HashMap<>();

    public void listarClientes() {
        System.out.println("Data de los clientes registrados en la empresa:\n");
        dataClientes.forEach((rut, datosCliente) -> {
            System.out.println("Rut: " + rut + ", " + datosCliente);
        });
    }

    public HashMap<String, DetallesCliente> getDataClientes() {
        return dataClientes;
    }
}
