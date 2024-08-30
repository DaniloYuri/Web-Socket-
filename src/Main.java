import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(4000);
        Socket accept = socket.accept();
        System.out.println("Accepted connection from " + accept);

        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        PrintStream out = new PrintStream(accept.getOutputStream());
        BufferedReader br = new BufferedReader(isr);
        String x ;
        while ((x = br.readLine()) != null) {
            out.println("Servidor: "+ x);
        }
    }
}