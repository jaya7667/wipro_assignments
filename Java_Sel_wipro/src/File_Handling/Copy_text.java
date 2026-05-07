package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_text {

	public static void main(String[] args) throws IOException {
		File f1= new File("Text.txt");
		f1.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter("Text.txt"));
		bw.write("Welcome to Java Learning");
		bw.write("\nJava Training class");
		bw.write("\nJava With Selenium\n");
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
		String l1;
        while((l1=br.readLine())!=null)
        {
        	System.out.println(l1);
        }
        //System.out.println(f1.length());
        
        br.close();
		// TODO Auto-generated method stub

	}

}
