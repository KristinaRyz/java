import java.io.File;
import java.io.IOException;

public class FileFolderTest {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\_qa_10");// ekranirovat//java.io
		if(f1.exists() != true){//est li takaya papka?
			//System.out.println("The folder exists");
			f1.mkdir();//posle sozdalas papka (make directory)
		}
		File f2 = new File("C:\\_qa_10\\1\\2\\3");//sozdaem papki 1,2,3
		if(f2.exists() == false){
			f2.mkdirs();//sozdaem mnogo papok
		}
		System.out.println(f1.isDirectory());//est li directory?
		System.out.println(f1.canWrite());//mojno li pisat? svoi permicion
		System.out.println(f1.delete());//ne udalyaet 
		System.out.println(f2.delete());//udalila 3 papky


		System.out.println("----------------LIST----------------");
		File[] list = f1.listFiles();//vozvrawaet array type file
		for(int i = 0; i<list.length; i++){
			System.out.println(list[i].getAbsolutePath());//polu4it kajduu papku
			//System.out.println(list[i].getParent());//povtorayet nazvanie directory
			System.out.println(list[i].isDirectory());//pokazivaet na file false - t.k. directory

			//if()

		}
		File f3 = new File("C:\\");
		System.out.println(((f3.getFreeSpace()/1024)/1024)/1024 + " " + "GBT");//vernet mesto svobodnoe na diske C v byte
		System.out.println(f1.getParentFile().getAbsolutePath());//ssilka na object parent etogo objecta // t.e. disk c


		File f4 = new File("C:\\_qa_10\\myFile.txt");
		if(f4.exists() == false){
			f4.createNewFile();//sozdaet file//declarete trows IOException
		} else {
			f4.delete();//udalyaet i sozdaet postoyanno
		}
	}
}


