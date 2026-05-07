package File_Handling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Append_file {

	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("Text.txt",true);
		f1.write("\n This is append statement");
		f1.close();
		FileReader reader = new FileReader("Text.txt");
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
		// TODO Auto-generated method stub

	}

}
