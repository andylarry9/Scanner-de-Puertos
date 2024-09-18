package consola;
import java.io.IOException;
import java.net.*;

public class Main {
    private static String host = "localhost";
    public static void main(String[] args) {
        // TODO code application logic here
        for (int puerto = 1; puerto <= 1024; puerto++) {
            System.out.println("Nro. Puerto: " + puerto);            
            try{
                Socket s = new Socket(host, puerto);                
                System.out.println("Hay un servidor en el puerto " + puerto);
                System.out.println(s.getLocalAddress());
                System.out.println(s.getLocalPort());
                System.out.println(s.getPort());
                System.out.println(s.getInetAddress());   
                // El puerto local es asignado automaticamente en
                // tiempo de ejecucion 
            } catch (UnknownHostException e) {
                // TODO Auto-generated catch block
                System.out.println("Excepcion: "+e);
                break;
            } catch (IOException e) {
                    // No debe existir un servidor en este puerto
            }          
        }
    }
    
}
