package com.ths;

public class LifeCycle implements Runnable {
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("run() method");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		
		LifeCycle obj = new LifeCycle();
//		obj.run();
		
		Thread t1 = new Thread(obj);
		System.out.println("before starting thread state : " + t1.getState());
		System.out.println("before starting thread status : " + t1.isAlive());
		t1.start();
		System.out.println("After starting thread state : " + t1.getState());
		System.out.println("After starting thread status : " + t1.isAlive());
		Thread.sleep(500);
		System.out.println("in sleep thread state : " + t1.getState());
		System.out.println("in sleep thread status : " + t1.isAlive());
		t1.join();
		System.out.println("After join thread state : " + t1.getState());
		System.out.println("After join thread status : " + t1.isAlive());
		
		
		
		Runnable t2 = () -> {
			System.out.println("run() from runnable");
		};
		
		
		
		Thread t3 = new Thread(
				() -> System.out.println("run() from lambda function")
				);
		t3.start();

	}

}
