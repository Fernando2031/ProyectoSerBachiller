/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class simulador {
    private String id_simulador;
    private String id_categoria;
    private String cod_persona;
    private String nombre_topico;

    public simulador(String id_simulador, String id_categoria, String cod_persona, String nombre_topico) {
        this.id_simulador = id_simulador;
        this.id_categoria = id_categoria;
        this.cod_persona = cod_persona;
        this.nombre_topico = nombre_topico;
    }

    public simulador(String id_simulador) {
        this.id_simulador = id_simulador;
    }

    public simulador() {
    }

    public String getId_simulador() {
        return id_simulador;
    }

    public void setId_simulador(String id_simulador) {
        this.id_simulador = id_simulador;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCod_persona() {
        return cod_persona;
    }

    public void setCod_persona(String cod_persona) {
        this.cod_persona = cod_persona;
    }

    public String getNombre_topico() {
        return nombre_topico;
    }

    public void setNombre_topico(String nombre_topico) {
        this.nombre_topico = nombre_topico;
    }
    
    
    
}
