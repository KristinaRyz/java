import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder1 {

	public static void main(String[] args) throws IOException {
		String folderName = "folder";
		String fileName = "file";
		String disk = "C:/DISK DISK";
		String fileExt = ".txt";
		File f1 = null;
		File f2 = null;

		////////////////Create folder///////////////////////////
		for(int i = 1; i<=4; i++){
			if(i==1){
				f1 = new File(disk + "\\" + folderName + i);
				f1.mkdirs();

				//////////////////////Create file in folder////////////////
				f2  = new File(f1.getAbsolutePath() + "\\" + fileName + i + fileExt);
				f2.createNewFile();
			}
			else{
				String aPath = f1.getAbsolutePath();//pyt
				f1 = new File(aPath + "\\" + folderName + i);
				f1.mkdirs();
				f2 = new File(f1.getAbsolutePath() + "\\" + fileName + i + fileExt);
				f2.createNewFile();
			}

		}
	}
}

