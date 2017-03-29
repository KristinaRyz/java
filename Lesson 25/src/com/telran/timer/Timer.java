package com.telran.timer;

public class Timer extends Thread{
	private int count;

	public Timer(int count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = count; i> 0;i--){
			System.out.println(i + " sec to finish");
			try {
				this.sleep(1000);//spi 1000 mili sec 
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
	}


}
