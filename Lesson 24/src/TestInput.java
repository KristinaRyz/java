
import java.io.*;
import java.util.*;

import com.telran.inputoutput.testclasses.Person;

public class TestInput {

	public static void main(String[] args) {
		HashSet <Person >course = new HashSet <Person>();

		InputStreamReader is = new InputStreamReader(System.in);//vvod v console//ssilka v console
		BufferedReader br = new BufferedReader(is);//polu4aet info iz Stream
		String name, surName, idStr,answer;
		while(true){
			System.out.println("Please enter your name : " );
			try {   //    metod readline kidaet Exception
				name = br.readLine();//4itat s console i vozvrawaet string 
				System.out.println("Please enter yiur surname : ");
				surName = br.readLine();
				System.out.println("Please enter your id : ");
				idStr = br.readLine();

				int id = Integer.parseInt(idStr);// is Stringa selaem 4islo
				Person pr= new Person(name, surName, id);
				course.add(pr);
				
				System.out.println("Do you want to continue ? yes or no ?"); //posle pervogo rabotnika sprawivaem
				answer = br.readLine();//4itaem 4to napiwet user
				if(answer.equalsIgnoreCase("no")){
					TestInput.writeToFile(course);
					break;
				}
				//System.out.println("your name : " + name + " your surname : " + surName + " your id : " + idStr);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(course);
	}
	public static void writeToFile(HashSet<Person> course) throws IOException{
		File folder = new File("C:\\_qa_10\\course");
		if(folder.exists() == false)
			folder.mkdirs();

		String filePath = folder.getAbsolutePath() + "\\" + "course.txt";
		File file = new File(filePath);
		if(file.exists() == false)
			file.createNewFile();
		FileWriter fw = new FileWriter(file);//filePath
		BufferedWriter bw = new BufferedWriter(fw);
		for(Person pr: course){
			bw.write(pr.toString());
			bw.newLine();
		}
		bw.close();
	}


}
