package com.latam.alura;


import javax.swing.*;


public class CurrencyConverterApp {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            int choice = MenuPrincipal.mostrarMenu();

            if (choice == 0) {
                String fromCurrency = "MXN";
                String toCurrency = OpcionesMonedas.mostrarOpciones();

                if ("CANCEL".equals(toCurrency)) {
                    continue;
                }

                double amount = EntradaValor.obtenerCantidad();
                double result = converter.convertCurrency(fromCurrency, toCurrency, amount);
                ValorConversion.mostrarResultado(result);
            } else if (choice == 1) {
                FinalizarPrograma.mostrarMensaje();
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }

            int continueChoice = ContinuarPrograma.preguntarContinuar();
            if (continueChoice != JOptionPane.YES_OPTION) {
                FinalizarPrograma.mostrarMensaje();
                System.exit(0);
            }
        }
    }
}
