/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Damian
 */
public class Notas {
 

    private float probasEscritas;
    private float probaEscrita1;
    private float probaEscrita2;
    private float probaPractica;
    private int boletins;
    private float notaFinal;

    public void calcularNota() {
        DecimalFormat df = new DecimalFormat("0.00");

        probaEscrita1 = Float.parseFloat(JOptionPane.showInputDialog("Nota del primer examen teórico: "));

        probaEscrita2 = Float.parseFloat(JOptionPane.showInputDialog("Nota del segundo teórico: "));

        probasEscritas = (probaEscrita1 + probaEscrita2) / 2 * 40 / 100;

        probaPractica = Float.parseFloat(JOptionPane.showInputDialog("Nota del examen práctico: "));

        probaPractica = probaPractica * 40 / 100;

        int porcentaxe = Integer.parseInt(JOptionPane.showInputDialog("¿Que porcentaje de boletines tienes?"));

        if (porcentaxe > 90) {
            boletins = 2;
        } else if (porcentaxe <= 90 && porcentaxe >= 70) {
            boletins = 1;
        } else if (porcentaxe < 70) {
            boletins = 0;
        }
        notaFinal = probasEscritas + probaPractica + boletins;
        System.out.println("PROBAS TEÓRICAS...." + df.format(probasEscritas)
                + "\nPROBA PRÁCTICA...." + df.format(probaPractica)
                + "\nBOLETINS..........." + df.format(boletins)
                + "\nNOTA TOTAL........" + df.format(notaFinal) + "\n");

    }
    
    @Override
    public String toString(){
        return "\nnota: "+notaFinal;
    }
}
