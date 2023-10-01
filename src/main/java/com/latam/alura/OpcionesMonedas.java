package com.latam.alura;

import javax.swing.*;

class OpcionesMonedas {
    public static String mostrarOpciones() {
        String[] currencies = {"USD", "EUR", "GBP", "JPY", "KRW"};
        String selectedCurrency = (String) JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir:", "Moneda de Conversión", JOptionPane.QUESTION_MESSAGE, null, currencies, currencies[0]);
        if (selectedCurrency == null) {
            return "CANCEL";
        }
        return selectedCurrency;
    }
}
