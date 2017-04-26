/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author BRIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        Rueda r = new Rueda(15,"WW");
        Rueda r2 = new Rueda(15,"WW");
        Rueda r3 = new Rueda(15,"Michellin");
        Rueda r4 = new Rueda(15,"Michelin");
        
        Chasis ch = new Chasis("CHASIS");          
        Chasis ch2 = new Chasis("Chasisin");
                
        Motor m1 = new Motor("motroex", 886);
        Motor m2 = new Motor("motroex23", 889);
         
        Carro c1 = new Carro("MLY-775");
        Carro c2 = new Carro("JKJ-118");
                
        c1.setMotor(m2);
        c2.setMotor(m1);
        
        c1.setChasis(ch2);
        c1.setChasis(ch); 
        
        c1.setRuedas(r);
        c1.setRuedas(r2);
        c1.setRuedas(r3);
        c1.setRuedas(r4);
               
        Persona p1 = new Persona();
        p1.añadirCarro(c1);
        
        
        System.out.println(p1.toString());
    }
    
}