package org.fileOperation;

import java.io.File;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\11amJavaBatch");
		
		File[] a = f.listFiles();
		
		for (File x : a) {
			
			System.out.println(x);
			
		}

	}

}
