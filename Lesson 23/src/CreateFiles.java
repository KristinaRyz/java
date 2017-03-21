import java.io.File;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) throws IOException {
		/*String folderName = "fold";
		String fileName = "file";
		String disk = "C:\\";
		String fileExt = ".txt"; //extention
		File f = null;
		for(int i = 1; i <= 3; i++){
			if(i==1){
				String path = disk + folderName + i;
				f = new File(path);//pervaya derictory
				f.mkdirs();
			}
			else{
				String aPath = f.getAbsolutePath();//pyt
				String path = aPath + "\\" + folderName + i;
				f = new File(path);
				f.mkdirs();
			}
		}
		String aPath = f.getAbsolutePath();//pet poslednei papki folder3
		for(int  i = 1; i <= 5; i++){
			String path = aPath +"\\" + "file" + i + fileExt;
			f = new File(path);
					f.createNewFile();//add throws IOException
	}*/
	deleteFiles("C:\\fold1\\fold2\\fold3");//	
	}		
	
	public static void deleteFiles(String folder){
	File f = new File(folder);
	File[] files= f.listFiles();
	for(int i = 0; i < files.length; i++){
		files[i].delete();
	}
		String parentPath = f.getPath();
		while(!parentPath.equalsIgnoreCase("C:\\")){
			File f1 = new File(parentPath);
			files = f1.listFiles();
			for(int i = 0; i < files.length; i++){
				files[i].delete();
			}
			parentPath = f1.getParent();
		}
			
		}
}

