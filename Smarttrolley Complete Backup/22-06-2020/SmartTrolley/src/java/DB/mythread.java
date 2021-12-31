/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.Socket;

/**
 *
 * @author Lenovo
 */
public class mythread extends Thread{
    
    Socket s;
    private DataInputStream in       =  null; 
    public mythread(){
        try{
        s=new Socket("localhost",8084);
        in = new DataInputStream( 
                new BufferedInputStream(s.getInputStream())); 
        start();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void run(){
        try{
            String line="";
            while(true){
                line = in.readLine(); 
                    System.out.println(line); 
                
                sleep(1000);
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        mythread t=new mythread();
    }
}
