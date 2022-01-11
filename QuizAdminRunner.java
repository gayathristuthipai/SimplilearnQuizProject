package firstSimpliLearnProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class QuizAdminRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		boolean isFound=false;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=obj.nextLine();
		var result=Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\Assignments\\Project1\\QuizData.txt"));
		for(var r:result) {
			var data=r.split(",");
			if(name.equalsIgnoreCase(data[0])) {
				System.out.println("Score= "+data[1]);
				isFound=true;
				break;
				
			}
		}
		if(isFound==false) {
			System.out.println("Name not Found");
		}
		
	}

}
