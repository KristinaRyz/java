import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {

	public static void main(String[] args) throws IOException {
		String folderName = "folder ";
		String disk = "C:\\DISK";
		String fileName = "file ";
		String fileExt = ".txt";

		File f1= null;
		File f2 = null;

		////////////////Create folder///////////////////////////
		for(int i = 1; i<=4; i++){
			if(i==1){
				String path = disk + "\\" + folderName + i;
				f1 = new File(path);
				f1.mkdirs();

				//////////////////////Create file in folder////////////////
				String aPath = f1.getAbsolutePath() + "\\" + fileName + i + fileExt;
				f2 = new File(aPath);
				f2.createNewFile();
			}
			else{
				String aPath = f1.getAbsolutePath();//pyt
				String path = aPath + "\\" + folderName + i;
				f1 = new File(path);
				f1.mkdirs();
				String aPat = f1.getAbsolutePath() + "\\" + fileName + i + fileExt;
				f2 = new File(aPat);
				f2.createNewFile();
			}
		}

	}
}