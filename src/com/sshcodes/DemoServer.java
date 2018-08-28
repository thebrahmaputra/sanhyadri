package com.sshcodes;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class DemoServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int servInp, servOup;
		ServerSocket ssk = new ServerSocket(8080);
		Socket sk = ssk.accept();
		Scanner ser = new Scanner(sk.getInputStream());
		servInp = ser.nextInt();
		servInp *= servInp;
		
		PrintStream pss = new PrintStream(sk.getOutputStream());
		pss.println(servInp);		
		
	}

}
