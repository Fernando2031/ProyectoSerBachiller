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
public class preguntas {
    private String id_pregunta;
    private String descripcion;
    private String id_simulador;

    public preguntas(String id_pregunta, String descripcion, String id_simulador) {
        this.id_pregunta = id_pregunta;
        this.descripcion = descripcion;
        this.id_simulador = id_simulador;
    }

    public preguntas() {
    }
    
    
    
    public preguntas(String id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(String id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_simulador() {
        return id_simulador;
    }

    public void setId_simulador(String id_simulador) {
        this.id_simulador = id_simulador;
    }

    @Override
    public String toString() {
        return "preguntas{" + "id_pregunta=" + id_pregunta + ", descripcion=" + descripcion + ", id_simulador=" + id_simulador + '}';
    }
    
    
    
    
}
