
package com.mycompany.practicajava;


public class Guerrero extends Aventurero implements Entrenable{
    private int fuerza;
    
    public Guerrero(String codigo, String nombre, Rango rango, int fuerza) {
            super(codigo, nombre, rango);
            if (fuerza <= 0) {
                throw new IllegalArgumentException("La fuerza debe ser mayor a 0");
            }
            this.fuerza = fuerza; 
    }

    @Override
    public int calcularPoder() {
     return fuerza * 2;  
    }

    @Override
    public String atacar() {        
     return "El guerrero que ataco fue" + getNombre()+ "Un golpe con baston";
    }

    @Override
    public String entrenar() {
        return "El guerrero que entrena es;" + getNombre() + "Entrena su fuerza";
    }
    }
    
