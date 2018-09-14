package p4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
	
    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
    	super(fileName);
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList(fileName.split(".")));
    	if (!list.get(list.size()).equals(".txt")) {
    		super.close();
    		throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws UnsupportedFileNameException {
    	
    	
    }

	@Override
	public int available() throws IOException {
		// TODO Auto-generated method stub
		return super.available();
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	@Override
	protected void finalize() throws IOException {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public FileChannel getChannel() {
		// TODO Auto-generated method stub
		return super.getChannel();
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	@Override
	public int read(byte[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub
		return super.read(arg0, arg1, arg2);
	}

	@Override
	public int read(byte[] arg0) throws IOException {
		// TODO Auto-generated method stub
		return super.read(arg0);
	}

	@Override
	public long skip(long arg0) throws IOException {
		// TODO Auto-generated method stub
		return super.skip(arg0);
	}
}