/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Arrays;


/**
 *
 * @author BRIAN
 */
public class Carro {
    private Rueda[] ruedas; 
    private int contador;
    private String placa;
    private Motor Motor;
    private Chasis Chasis;
    

    public Carro(String placa){
        this.placa = placa;
        Chasis chss = new Chasis("");
        ruedas = new Rueda[4];
        this.contador = 0;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda rs){
        if(this.contador<5){
            this.ruedas [contador]= rs;
            this.contador++;
        }
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return Motor;
    }

    public void setMotor(Motor Motor) {
        this.Motor = Motor;
    }

    public Chasis getChasis() {
        return Chasis;
    }

    public void setChasis(Chasis Chasis) {
        this.Chasis = Chasis;
    }

    @Override
    public String toString() {
        return "Carro{" + "ruedas=" + Arrays.toString(ruedas) + ", placa=" + placa + ", Motor=" + Motor + ", Chasis=" + Chasis + '}';
    }

    
    

}