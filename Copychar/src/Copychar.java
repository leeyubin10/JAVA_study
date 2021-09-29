import java.io.*;

public class Copychar {
	public static void main(String args[]) {
		FileReader reader = null;
        FileWriter writer = null;
        int data = 0;
        try{
            reader = new FileReader(args[0]);
            writer = new FileWriter(args[1]);
            
            while(true) {
            	data = reader.read();
            	if(data == -1) break;
            	writer.write((char)data);
            }
            System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
            
        }
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				writer.close();
				reader.close();
			}
			catch (Exception e) {
			}
		}
	}
}
