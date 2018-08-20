/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytimeclient;
import javax.microedition.midlet.MIDlet;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author SaveEarth
 */
public class DayTimeClient extends MIDlet {
    
    @Override
    public void startApp() {
        
        try{
        SocketConnection socket = (SocketConnection)Connector.open("socket://localhost:"+13);
        System.out.println("Socket Connected");
        BufferedReader inFromServer = new BufferedReader (new InputStreamReader(socket.openInputStream()));
        String fromServer = inFromServer.readLine();
        System.out.println("[Server] " + fromServer);    
    }
         catch(IOException e) {
}
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
    }
}
