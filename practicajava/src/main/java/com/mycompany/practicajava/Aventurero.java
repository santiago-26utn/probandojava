
package com.mycompany.practicajava;

import java.util.Objects;


public abstract class Aventurero {
    private String codigo;
    private String nombre;
    private Rango rango;
    
    
    public  Aventurero(String codigo, String nombre, Rango rango) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("EL CODIGO NO PUEDE SER NULO NI ESTAR EN BLANCO"); 
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("EL NOMBRE NO DEBE SER NULO NI ESTAR EN BLANCO");
        }
        if (rango == null) {
            throw  new IllegalArgumentException("El rango es obligatorio");
        }
        this.codigo = codigo;
        
        this.nombre = nombre;
        
        this.rango = rango;
    }
        
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Rango getRango() {
        return rango;
        }
    
    public abstract int calcularPoder();
    
    public abstract String atacar();

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            
            
            
            
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Aventurero)) {
            return false;
        }
        final Aventurero other = (Aventurero) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
        
    }
    }
        


