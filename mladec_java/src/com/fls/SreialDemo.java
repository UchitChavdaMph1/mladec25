package com.fls;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class SreialDemo {
	
	public static void main(String[] args) {
		
		List<PlayersData> data = Arrays.asList(
				new PlayersData(1,"Kohli","All rounder", "Mumbai"),
				new PlayersData(2,"Rohit","Hit man", "Mumbai"),
				new PlayersData(3,"SKY","ALL rounder 360", "Mumbai")
				);
		
		String path = "src/team.txt";
		
		try (ObjectOutputStream ow = new ObjectOutputStream(new FileOutputStream(path)))
		{
			ow.writeObject(data);
			ow.flush();
			
			System.out.println("Done.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
