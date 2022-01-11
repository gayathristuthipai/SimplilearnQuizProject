package firstSimpliLearnProject;

import java.io.*;
import java.util.Scanner;

public class QuizRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int score=0;
		int option;
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter your name: ");
		name=obj.nextLine();
		System.out.println("Q1. Which is the national animal of the India?");
		System.out.println("1.Lion 2.Tiger 3.Rabbit 4.Elephant");
		option=obj.nextInt();
		if (option==2)
			score=score+20;
		System.out.println("Q1. Which is the national Bird of the India?");
		System.out.println("1.Peacock 2.Parrot 3.Crow 4.Pigeon");
		option=obj.nextInt();
		if (option==1)
			score=score+20;
		System.out.println("Q1. Which is the national Flower of the India?");
		System.out.println("1.Rose 2.Mariegold 3.Sunflower 4.Lotus");
		option=obj.nextInt();
		if (option==4)
			score=score+20;
		System.out.println("Q1. Who is the prime minister of India?");
		System.out.println("1.Narendra Modi 2.Harbajan Singh 3.Manmohan Singh 4.Rahul Gandhi");
		option=obj.nextInt();
		if (option==1)
			score=score+20;
		System.out.println("Q1. Who is the chief minister of Karnataka?");
		System.out.println("1.Siddarammaiah 2.Yadiyurappa 3.Basavaraj Bommaih 4.Kumaraswamy");
		option=obj.nextInt();
		if (option==3)
			score=score+20;
		System.out.println(name+", your score is: "+score);
		
		try {
		File f=new File("C:\\Users\\User\\Desktop\\Assignments\\Project1\\QuizData.txt");
		FileWriter fw=new FileWriter(f, true);
		fw.write(name+","+score+"\n");
		fw.close();
		}catch(Exception ex){
			ex.printStackTrace();
			}	
		}
}
