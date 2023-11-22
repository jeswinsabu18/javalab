/*file			:	Filecopycontents.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	File Handling Exception
 * date			:	22/11/23
 */
package javalabs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecopycontents {

	public static void main(String[] args) {
		String str="my name is jeswin sabu";
		char [] data=new char[50];
		FileWriter input=null;
		FileWriter output=null;
		FileReader string=null;
		try {
			input=new FileWriter("inputfile.txt");
			output=new FileWriter("outputfile.txt");
			input.write(str);
			input.flush();
			input.close();
			string=new FileReader("inputfile.txt");
			int size=string.read(data);
			string.close();
			output.write(data,0,size);
			output.flush();
			output.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
