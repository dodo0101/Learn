package p5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution  {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
		FileReader freader = new FileReader(breader.readLine());
		//C:\Users\fglus\eclipse-workspace\Learn\src\p5\test2
		BufferedReader breader2 = new BufferedReader(freader);
		
		StringBuilder sbuild = new StringBuilder();
		
		while(breader2.ready()) {
			sbuild.append(breader2.readLine());
		}
		
		String result = sbuild.toString();
		
		System.out.println(result);
		
		breader2.close();
		
	}
	
}
	



