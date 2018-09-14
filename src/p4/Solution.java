package p4;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ListIterator;
import java.util.ArrayList;;
/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> sList = new ArrayList<>();
        String sB = "";
        if (args.length > 0 && args[0].equals("-u")) {
            String id = String.format("%-8.8s", args[1]);
            id = id.trim();
            String prodName = String.format("%-30.30s",args[2]);
            String price = String.format("%-8.8s", args[3]);
            String quantity = String.format("%-4.4s", args[4]);
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String nameOfFile = reader.readLine();
                try (BufferedReader fileReader = new BufferedReader(new FileReader(nameOfFile))) {
                    String str = null;
                    while ((str = fileReader.readLine()) != null) {
                        sList.add(str);
                    }
                    
                    ListIterator<String> it = sList.listIterator();
                    while (it.hasNext()) {
                    	String s = it.next();
                    	sB = s.substring(0, 8);
                    	sB = sB.trim();
                    	if (sB.equals(id)) {
                    		id = String.format("%-8.8s", id);
                    		it.set(id + prodName + price + quantity);
                    	}
                    }
                    
                    BufferedWriter bf = new BufferedWriter(new FileWriter(nameOfFile));
                    for (String s : sList) {
                    	
                    	bf.write(s);
                    	bf.newLine();
                    }
                    bf.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                
                
            }
        } else if (args.length > 0 && args[0].equals("-d")) {
        	String id = String.format("%-8.8s", args[1]);
            id = id.trim();
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String nameOfFile = reader.readLine();
                try (BufferedReader fileReader = new BufferedReader(new FileReader(nameOfFile))) {
                    String str = null;
                    while ((str = fileReader.readLine()) != null) {
                        sList.add(str);
                    }
                    
                    ListIterator<String> it = sList.listIterator();
                    while (it.hasNext()) {
                    	String s = it.next();
                    	sB = s.substring(0, 8);
                    	sB = sB.trim();
                    	if (sB.equals(id)) {
                    		it.remove();
                    	}
                    }
                    
                    BufferedWriter bf = new BufferedWriter(new FileWriter(nameOfFile));
                    for (String s : sList) {
                    	
                    	bf.write(s);
                    	bf.newLine();
                    }
                    bf.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                
                
            }
        }
    }
    
}





