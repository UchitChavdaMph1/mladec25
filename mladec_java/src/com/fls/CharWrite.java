package com.fls;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CharWrite {
	
	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("src/chartest.txt"); BufferedWriter bw = new BufferedWriter(fw))
		{
			String msg = "This is a simple char output stream write and read operation";
			bw.write(msg);
			System.out.println("Done.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
