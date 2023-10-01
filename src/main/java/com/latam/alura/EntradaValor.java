package com.latam.alura;

import javax.swing.*;

class EntradaValor {
    public static double obtenerCantidad() {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Ingrese la cantidad:");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                ManejoErrores.mostrarError();
            }
        }
    }
}