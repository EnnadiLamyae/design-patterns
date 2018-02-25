/**
 * 
 */
package hf.dp.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author root
 *
 */
public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws IOException{
	
		int c;
		String path = "/root/Documents/workspace-eclipse/head-first-design-pattern/test.txt";
		try {
			LowerCaseDecorator in = new LowerCaseDecorator(new BufferedInputStream(new FileInputStream(path)));
			while((c = in.read())>0)
				System.out.print((char)c);
			in.close();
		} catch (IOException exception) {
			exception.getMessage();
		}

	}

}
