/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printinfoserver;

import javax.microedition.midlet.MIDlet;
import javax.microedition.io.Connector;
import javax.microedition.io.ServerSocketConnection;
import javax.microedition.io.SocketConnection;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author SaveEarth
 */
public class PrintInfoServer extends MIDlet {
    
    @Override
    public void startApp() {
        
        try{
        ServerSocketConnection serverSocket = (ServerSocketConnection)Connector.open("socket://:" + 7777);
        System.out.println("Server listen on port 777. Waiting for a client...");
        SocketConnection connectedSocket = (SocketConnection)serverSocket.acceptAndOpen();
        BufferedReader inFromClient= new BufferedReader (new InputStreamReader(connectedSocket.openDataInputStream()));
        while(true){
                String fromServer = inFromClient.readLine();
                System.out.println("Client Says: " + fromServer);
}
        }
        
 catch(IOException e) {
}
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
    }
}
