/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class persona {
   private String cod_persona;
   private int puntaje;

    public persona() {
    }

    public persona(String cod_persona) {
        this.cod_persona = cod_persona;
    }

    public persona(String cod_persona, int puntaje) {
        this.cod_persona = cod_persona;
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public String getCod_persona() {
        return cod_persona;
    }

    public void setCod_persona(String cod_persona) {
        this.cod_persona = cod_persona;
    }
   
   
   
}
