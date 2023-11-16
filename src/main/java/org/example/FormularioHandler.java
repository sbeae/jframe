package org.example;

import javax.swing.*;
import java.util.HashMap;

public enum FormularioHandler {
    INSTANCE;


    public void registerClient(String[] clientDataArr) {

        for (String dataValue : clientDataArr) {
            if (dataValue.isBlank()) {
                System.err.println("Uno o mas campos del formulario estaban vacios.");
                return;
            }
        }

        if (!Empresa.INSTANCE.getDataClientes().containsKey(clientDataArr[0])) {

            Empresa.INSTANCE.getDataClientes().put(
                    clientDataArr[0], new DetallesCliente(clientDataArr[1], clientDataArr[2], clientDataArr[3])
            );

            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
            Empresa.INSTANCE.listarClientes();
            return;
        }

        System.err.println("El rut entregado ya se encuentra en uso.");
    }
}
