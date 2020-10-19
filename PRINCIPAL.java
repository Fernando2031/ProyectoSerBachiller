package clases;


import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PRINCIPAL {

    
    
    public static void CREARPREGUNTA(ObjectContainer base1, String id_pregunta, String descripcion, String id_simulador){
        preguntas c1 = new preguntas(id_pregunta, descripcion, id_simulador);
        if (verificarPreguntas(base1, id_pregunta)==0) {
            base1.set(c1);
            JOptionPane.showMessageDialog(null, "Pregunta creada");
        }else{
            JOptionPane.showMessageDialog(null,"La pregunta YA EXISTE");
        }
        
    
    }
    public static void CREARRESPUESTA(ObjectContainer base1, String id_respuesta, String id_categoria, String id_pregunta, String res_correcta, String res_falsa1, String res_falsa2, String res_falsa3, String res_falsa4){
        respuestas p1 = new respuestas(id_respuesta,id_categoria,id_pregunta,res_correcta,res_falsa1,res_falsa2,res_falsa3, res_falsa4);
        if (verificarRespuesta(base1, id_respuesta)==0) {
            base1.set(p1);
            JOptionPane.showMessageDialog(null, "Respuestas CREADAS");
        }else{
            JOptionPane.showMessageDialog(null,"Las respuestas YA EXISTEN");
        }
        
    
    }

    
    public static int verificarPreguntas(ObjectContainer base1, String id_pregunta){
        
        preguntas c1 = new preguntas(id_pregunta);
        ObjectSet resul= base1.get(c1);
        
        return resul.size();
    }
    
    
    public static int verificarRespuesta(ObjectContainer base1, String cod){
        
        respuestas p1 = new respuestas(cod);
        ObjectSet resul= base1.get(p1);
        
        return resul.size();
    }
    
    public static int verificarpregunta(ObjectContainer base1, String cod){
        
        respuestas p1 = new respuestas(cod);
        ObjectSet resul= base1.get(p1);
        
        return resul.size();
    }
    
    
}
