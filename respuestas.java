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
public class respuestas {
    private String id_respuesta;
    private String id_categoria;
    private String id_pregunta;
    private String res_correcta;
    private String res_falsa1;
    private String res_falsa2;
    private String res_falsa3;
    private String res_falsa4;

    public respuestas(String id_respuesta, String id_categoria, String id_pregunta, String res_correcta, String res_falsa1, String res_falsa2, String res_falsa3, String res_falsa4) {
        this.id_respuesta = id_respuesta;
        this.id_categoria = id_categoria;
        this.id_pregunta = id_pregunta;
        this.res_correcta = res_correcta;
        this.res_falsa1 = res_falsa1;
        this.res_falsa2 = res_falsa2;
        this.res_falsa3 = res_falsa3;
        this.res_falsa4 = res_falsa4;
    }

    
    
    public respuestas(String id_respuesta, String id_categoria, String res_correcta, String res_falsa1, String res_falsa2, String res_falsa3, String res_falsa4) {
        this.id_respuesta = id_respuesta;
        this.id_categoria = id_categoria;
        this.res_correcta = res_correcta;
        this.res_falsa1 = res_falsa1;
        this.res_falsa2 = res_falsa2;
        this.res_falsa3 = res_falsa3;
        this.res_falsa4 = res_falsa4;
    }

    
    
    public respuestas(String id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public respuestas() {
    }

    public String getRes_correcta() {
        return res_correcta;
    }

    public void setRes_correcta(String res_correcta) {
        this.res_correcta = res_correcta;
    }

    public String getRes_falsa1() {
        return res_falsa1;
    }

    public void setRes_falsa1(String res_falsa1) {
        this.res_falsa1 = res_falsa1;
    }

    public String getRes_falsa2() {
        return res_falsa2;
    }

    public void setRes_falsa2(String res_falsa2) {
        this.res_falsa2 = res_falsa2;
    }

    public String getRes_falsa3() {
        return res_falsa3;
    }

    public void setRes_falsa3(String res_falsa3) {
        this.res_falsa3 = res_falsa3;
    }

    public String getRes_falsa4() {
        return res_falsa4;
    }

    public void setRes_falsa4(String res_falsa4) {
        this.res_falsa4 = res_falsa4;
    }

    

    public String getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(String id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "respuestas{" + "id_respuesta=" + id_respuesta + ", id_categoria=" + id_categoria + ", id_pregunta=" + id_pregunta + ", res_correcta=" + res_correcta + ", res_falsa1=" + res_falsa1 + ", res_falsa2=" + res_falsa2 + ", res_falsa3=" + res_falsa3 + ", res_falsa4=" + res_falsa4 + '}';
    }
    
    
    
            
}
