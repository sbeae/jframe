package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFormulario extends JFrame implements ActionListener {

    private JPanel FormularioEmpresaPanel;
    private JTextField nombreClienteField;
    private JTextField ciudadClienteField;
    private JTextField telefonoClienteField;
    private JButton enviarFormularioButton;
    private JLabel ciudadClienteLabel;
    private JLabel telefonoClienteLabel;
    private JLabel nombreClienteLabel;
    private JTextField rutClienteField;
    private JLabel rutClienteLabel;

    public VentanaFormulario() {
        setUpGUI();
    }

    private void setUpGUI() {
        setTitle("Formulario Empresa");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(800, 600);
        setContentPane(FormularioEmpresaPanel);
        ciudadClienteField.addActionListener(this);
        nombreClienteField.addActionListener(this);
        telefonoClienteField.addActionListener(this);
        enviarFormularioButton.addActionListener(this);
        rutClienteField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource().equals(enviarFormularioButton)) {
            FormularioHandler.INSTANCE.registerClient(new String[]{
                    rutClienteField.getText(), nombreClienteField.getText(),
                    ciudadClienteField.getText(), telefonoClienteField.getText()
            });
        }
        
    }
}
