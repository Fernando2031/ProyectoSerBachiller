/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntasrepuestas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.ListModel;

/**
 *
 * @author cmsanchez
 */

public class ManejadorArchivos {
    
    ArrayList<String> preguntas;
    ArrayList<String> repuestas;
    String usuario = System.getProperty("user.name");
    String carpeta = "C:\\Users\\"+usuario+"\\Documents\\PreguntasRepuestas\\";
    int opcion = 0;
    
    public void CrearCarpeta()
    {
        File car = new File(carpeta);
        
        if(!car.exists())
        {     
            car.mkdir();
        }
    }
    
    public boolean existenPregunta()
    {
        preguntas = Preguntas();
        
        return preguntas.isEmpty();

    }
    
    public void AgregarPregunta(ListModel Preguntas)
    {
        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"Preguntas.txt");
            
            BufferedWriter bw;      
            
            bw = new BufferedWriter(new FileWriter(archivo));     
            
            
            for(int j = 0; j < Preguntas.getSize();j++)
            {
                Object pregunta =  Preguntas.getElementAt(j);
                bw.write((String)pregunta); 
                bw.newLine();
            }
            
            bw.close();         
            
        }catch(Exception ex)
        {
            
        }

    }
    
    public void AgregarRepuesta(ListModel repuestas)
    {

        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"Repuestas.txt");
            
            if(!archivo.exists())
            {
                archivo.createNewFile();
            }
            
            BufferedWriter bw; 
                  
            
            bw = new BufferedWriter(new FileWriter(archivo));
            
            for(int j = 0; j < repuestas.getSize();j++)
            {
                Object repuesta =  repuestas.getElementAt(j);
                bw.write((String)repuesta); 
                bw.newLine();
            }
            
            bw.close();
                              
        }catch(Exception ex)
        {
            
        }

    }
    
    
    public ArrayList<String> Preguntas()
    {
        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"Preguntas.txt");
            
            if(!archivo.exists())
            {
                archivo.createNewFile();
            }

            BufferedReader br;
            
            br = new BufferedReader(new FileReader(archivo));                         
            String linea;
            preguntas = new ArrayList<String>();
            int i = 1;
            while((linea = br.readLine())!= null)
            {
                preguntas.add(linea);
                i++;
            }
            br.close(); 
            
            return preguntas;
            
        }catch(Exception ex)
        {
            
        }
        
        return preguntas;
    }
    
    
    public ArrayList<String> Repuestas()
    {
        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"Repuestas.txt");
            
            if(!archivo.exists())
            {
                archivo.createNewFile();
            }

            BufferedReader br;
            
            br = new BufferedReader(new FileReader(archivo));                         
            String linea;
            repuestas = new ArrayList<String>();
            int i = 1;
            while((linea = br.readLine())!= null)
            {
                repuestas.add(linea);
                i++;
            }
            br.close(); 
            
            return repuestas;
            
        }catch(Exception ex)
        {
            
        }
        
        return repuestas;
    }
    
    
    public void AgregarConfiguracion(String Configuracion)
    {       
        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"Configuracion.txt");
            
            if(!archivo.exists())
            {
                archivo.createNewFile();
            }
            
            BufferedWriter bw;  

            
            bw = new BufferedWriter(new FileWriter(archivo));         
            bw.write(Configuracion); 
            bw.newLine();                 
            bw.close();
        
            
        }catch(Exception ex)
        {
            
        }
        
    }
    
    
    public String Configuracion()
    {
        String line = "0,0";

        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"Configuracion.txt");
            
            if(!archivo.exists())
            {
                archivo.createNewFile();
                AgregarConfiguracion("0,0");
            }
            
            BufferedReader br;              
            br = new BufferedReader(new FileReader(archivo));  
            line = br.readLine();
            br.close();
            
            return line;
                     
        }catch(Exception ex)
        {
            
        }
        
        return line;       
    }
    
}
