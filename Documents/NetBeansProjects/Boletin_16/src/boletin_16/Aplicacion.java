/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

import datos.Persoal;


/**
 *
 * @author Damian
 */
public class Aplicacion {
    
    
        public static void main(String[] args) {
        
        
        Persoal per1 = new Persoal("671354972","damian@gmail.com");
        Notas not = new Notas();
        not.calcularNota();
        Academica aca1 = new Academica("Damian",not,per1);
        
        System.out.println(aca1.toString());
  
    }
}
