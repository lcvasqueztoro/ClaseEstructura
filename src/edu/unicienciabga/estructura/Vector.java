package edu.unicienciabga.estructura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vector extends JFrame {
    private JPanel contentPane;
    private JButton primerEjercicioButton;
    private JButton segundoEjercicioButton;

    private int generatePseudoRandom (int limInf, int limSup) {
        return (int)(Math.random() * (limSup - limInf + 1)) + limInf;
    }

    public Vector() {
        // Inicializacion del control
        setContentPane(contentPane);
        primerEjercicioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPerformed_primerEjercicioButton(e);
            }
        });
        segundoEjercicioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPerformed_segundoEjercicioButton(e);
            }
        });
    }

    public void actionPerformed_primerEjercicioButton(ActionEvent e) {
        // Inicializacion del vector
        Integer[] vectorRandom = new Integer[10];
        // Dar valor
        for (int i = 0;i < vectorRandom.length;i++) {
            vectorRandom[i] = generatePseudoRandom(100, 200);
            boolean esPar = vectorRandom[i] % 2 == 0;
            System.out.println(i + " :: " + vectorRandom[i] + " :: " + (esPar ? "par" : "impar"));
        }
    }

    public void actionPerformed_segundoEjercicioButton(ActionEvent e) {
        // Inicializacion del vector
        Integer[] vectorRandom = new Integer[20];
        // Dar valor y evaluar
        int numeroMasGrande = 0;
        System.out.print("\n Vector: ");
        for (int i = 0; i < vectorRandom.length;i++) {
            vectorRandom[i] = generatePseudoRandom(1, 50);
            if (vectorRandom[i] > numeroMasGrande) numeroMasGrande = vectorRandom[i];
            System.out.print(" " + vectorRandom[i] + " ");
        }
        System.out.print("\n El numero mas grande es: " + numeroMasGrande);
    }

}
