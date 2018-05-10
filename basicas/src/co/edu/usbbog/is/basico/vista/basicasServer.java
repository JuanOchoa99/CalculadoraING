/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.basico.vista;

import co.edu.usbbog.is.basico.controlador.operador;
import co.edu.usbbog.is.basico.modelo.operacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 204
 */
public class basicasServer {
    private final static int port=9990;
    
    
    public static void main(String[] args) throws ClassNotFoundException {
        
         Object o = null;
        
        try{
                ServerSocket serverSocket = new ServerSocket(port);
                System.out.println("basicasServidor iniciando...");
                System.out.println("BasicasServidor esperando cliente...");
                Socket clienteSocket=null;
                FileWriter fw=null;
                ObjectOutputStream oos = null;
                ObjectInputStream ois = null;
                
              
                
                   
                while(true){
                     clienteSocket = serverSocket.accept();
                    System.out.println("Conexion aceptada");
                    ois = new ObjectInputStream(clienteSocket.getInputStream());
                    o=(Object) ois.readObject();

                    if(o==null)break; 
                    operador operador = new operador();
                    operador.operar((operacion) o);
                }
                
               oos.close();
               ois.close();
        
    } catch(IOException e){
            System.out.println("no se pudo conectar");
            System.out.println(-1);
    }
}
}
