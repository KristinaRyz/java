package com.telran.timer;

import java.awt.Toolkit;
import java.io.*;

import javax.tools.Tool;

public class TimerStarter {

	public static void main(String[] args) throws Exception {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int time = 0;
		
		System.out.println("Please enter timer duration in sec.");
		String stime = br.readLine();//vvedet cifru v vide stringa
		time = Integer.parseInt(stime);
		
		Timer timer = new Timer(time);
		System.out.println("The timer started");
		timer.start();
		timer.join();
		Toolkit.getDefaultToolkit().beep();
		System.out.println("Timer finished");
	}

}
