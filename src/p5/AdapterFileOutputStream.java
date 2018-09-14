package p5;

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    AmigoStringWriter asWriter;
   
   private FileOutputStream fileOutputStream;
   
   public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
       this.fileOutputStream = fileOutputStream;
   }
   
   public static void main(String[] args) {

   }
   
   @Override
   public void flush() throws IOException {
       this.fileOutputStream.flush();
   }

   @Override
   public void writeString(String s) throws IOException {
       
	   
	   
	   this.fileOutputStream.write(s.getBytes("UTF-8"));
       
       
       
   }
   
   @Override
   public void close() throws IOException {
       this.fileOutputStream.close();
   }
   

}