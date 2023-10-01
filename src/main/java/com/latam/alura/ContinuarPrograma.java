package com.latam.alura;

import javax.swing.*;

class ContinuarPrograma {
    public static int preguntarContinuar() {
        String[] options = {"Sí", "No"};
        return JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Continuar", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }
}