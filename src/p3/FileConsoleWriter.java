package p3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileDescriptor;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {
	private FileWriter fileWriter;
	
	public FileConsoleWriter(File file) throws IOException {
		this.fileWriter = new FileWriter(file);
	}
	
	public FileConsoleWriter(File file, boolean append) throws IOException {
		this.fileWriter = new FileWriter(file, append);
	}
	
	public FileConsoleWriter(FileDescriptor fd) {
		this.fileWriter = new FileWriter(fd);
	}
	
	public FileConsoleWriter(String fileName) throws IOException {
		this.fileWriter = new FileWriter(fileName);
	}
	
	public FileConsoleWriter(String fileName, boolean append) throws IOException {
		this.fileWriter = new FileWriter(fileName, append);
	}
	
	public void write(char[] cbuf, int off, int len) throws IOException {
		this.fileWriter.write(cbuf, off, len);
		for (int i = off; i < off + len; i++) {
			System.out.print(cbuf[i]);
		}
		System.out.println();
	}
	
	public void write(int c) throws IOException {
		this.fileWriter.write(c);
		System.out.println(c);
	}
	
	public void write(String str) throws IOException {
		this.fileWriter.write(str);
		System.out.println(str);
	}
	
	public void write(String str, int off, int len) throws IOException {
		this.fileWriter.write(str, off, len);
		System.out.println(str.substring(off, off + len));
	}
	
	public void write(char[] cbuf) throws IOException {
		this.fileWriter.write(cbuf);
		for (int i = 0; i < cbuf.length; i++) {
			System.out.print(cbuf[i]);
		}
		System.out.println();
	}
	
	public void close() throws IOException {
		this.fileWriter.close();
	}

}