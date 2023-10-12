package file_operations;
import java.io.*;

public class File_Read_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file= "C:\\Users\\uday2\\OneDrive\\Documents\\Doc1.docx" ;
		
		File file1=new File(file );
		
		
		System.out.println(file1.exists());
		System.out.println(file1.canRead());
		
		
		System.out.println(file1.canExecute());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getFreeSpace());
		System.out.println(file1.getName());
		System.out.println(file1.getPath());
		System.out.println(file1.isFile());
		System.out.println(file1.setLastModified(0));
		System.out.println("/////////");
		
		
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		FileWriter fw=new FileWriter(file1);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello...");
		bw.flush();
		
	System.out.println(br.readLine());
		System.out.println("End......");
		
	}

}
