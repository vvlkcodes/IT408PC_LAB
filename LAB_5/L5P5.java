import java.io.*;

class L5P5{
	public static void main(String[] args) throws IOException{
		File f = new File("myFile.java");
		if(f.exists()){
			System.out.println("The file is created successfully!");
		}else{
			f.createNewFile();
			System.out.println("File exists: "+f.exists());
		}
	}
}
