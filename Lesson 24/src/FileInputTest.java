import java.io.*;

public class FileInputTest {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\_qa_10\\myfold" + "\\" + "myFile.txt";
		File file = new File(filePath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);//formatirovanie vvod, 4itat postro4no
		String str = "";
		while(true){
			str =br.readLine();
			if(str == null)
				break;
			System.out.println(str);
		}
		 br.close();//zakrit i otpustit file
	}

}
