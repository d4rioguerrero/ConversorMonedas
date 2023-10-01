package com.latam.alura;

import javax.swing.*;

class MenuPrincipal {
    public static int mostrarMenu() {
        String[] options = {"Convertir moneda", "Salir"};
        return JOptionPane.showOptionDialog(null, "Elija una opción", "Conversor de Divisas", 0, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    }
}