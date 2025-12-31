package com.ths;
 
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
public class TaskScheduleDemo {
	
	static class SystemTask implements Runnable
	{
		public int add = 0;
		@Override
		public void run() {
			add += 1;
			System.out.print("Running Background Task...");
			System.out.println(add);
		}
	}
	public static void main(String[] args) {
		
		
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new SystemTask(), 0, 5, TimeUnit.SECONDS);
		
		
 
	}
 
}