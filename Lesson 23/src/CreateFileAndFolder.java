import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {

	public static void main(String[] args) {
		try {
			CreateFileAndFolder.createFile("C:\\telRan\\qa_10", "thebestfile.txt");//surround try catch
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void createFile(String folderName, String fileName) throws IOException{
		File folder = new File(folderName);	
		if(folder.exists()==false){
			folder.mkdirs();//sozdaem folder
		}
		String filePath = folder + "\\" + fileName;
		File file = new File(filePath);
		if(file.exists() == false){
			file.createNewFile();//throws IOException
		}
	}
}
