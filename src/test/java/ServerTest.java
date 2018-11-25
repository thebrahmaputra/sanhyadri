
//import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ServerTest {

    public static void main(String args[]) throws UnknownHostException, IOException {
        // TODO Auto-generated method stub
        int serverInput, serverOutput;
        Scanner scin = new Scanner(System.in);
        //Socket sk = new Socket("192.168.1.161", 8080)
        do {
            Socket sk = new Socket("192.168.1.70", 8080);
            Scanner servSc = new Scanner(sk.getInputStream());
            System.out.println("Enter a number");
            serverInput = scin.nextInt();
            PrintStream ps = new PrintStream(sk.getOutputStream());
            ps.println(serverInput);

            serverOutput = servSc.nextInt();
            System.out.println(serverOutput);
            sk.close();
            servSc.close();
        }while(serverInput!=1);
        //System.out.println("Test successful");
    }
}
