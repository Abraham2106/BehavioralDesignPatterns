/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author solan
 */
public class Server {

    public static void main(String[] args) throws IOException {

        final int PUERTO = 5000;
        ServerSocket s = null;
        Socket sc = null;

        DataInputStream in;
        DataOutputStream out;

        s = new ServerSocket(PUERTO);
        System.out.println("Servdor inicializado");

        while (true) {

            sc = s.accept(); //Socket cliente

            //Comunicacion entre server y cliente
            in = new DataInputStream(sc.getInputStream()); //Recibe mensajes del cliente
            out = new DataOutputStream(sc.getOutputStream());

            String mensaje = in.readUTF();
            System.out.println(mensaje);
            out.writeUTF("Desde el server");
            
            sc.close();
            System.out.println("Cliente desconectado");

        }
    }

}
