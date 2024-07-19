package com.nextstep.quizapplication.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class quiz {
	ArrayList<Quizdto> questionList = new ArrayList<>();
	ArrayList<Quizdto> playerList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	int score = 0;
	public void playQuiz() {
		questionList.clear();
		setQuestions();
		System.out.println("Enter your name");
		String name= scString.nextLine();
		
		
		for(int i=0;i<questionList.size();i++) {
		System.out.println(questionList.get(i).questions);
		System.out.println(questionList.get(i).answerlist);
		
		int answer= sc.nextInt();
		if(answer==questionList.get(i).correctanswer) {
			score++;
			System.out.println("Your Score is="+score);
		}
		else {
			System.out.println("Incorrect Answer");
		}
		}
		
		System.out.println("Congrulations!!!"+name+" your score is="+score);
		Quizdto player = new Quizdto(name, score);
		playerList.add(player);
		
		System.out.println("Do you want to play again(yes/no)");
		String choice=scString.nextLine();
         if(choice.equalsIgnoreCase("yes")) {
		
			playQuiz();
		}
		else {
			System.out.println("Thank you for playing"+name);
			highscore();
		}
		//aaa
		
	}
	public void highscore() {
		int greatest = playerList.get(0).score;
		int Index = 0;
		
		for (int i=0;i<playerList.size();i++) {
			if(playerList.get(i).score> greatest) {
				greatest = playerList.get(i).score;
				Index = i;
			}
		}
		System.out.println("The player having greatest score is "+playerList.get(Index).name);
		System.out.println("And the greatest score is "+playerList.get(Index).score);
	}
	public void setQuestions() {
		
		
		Quizdto question1 = new Quizdto("Which is the biggest lake of Nepal?", Arrays.asList("1.Rara lake","Phoksundo Lake","3.Tilicho lake","4.Phewa lake"), 1);
		Quizdto question2 = new Quizdto("Who is the richest person in the world?",Arrays.asList("1.Mukesh Ambani","2.Mark Zugerberg","3.Bernard Arnault","4.Elon Musk"), 3);
		Quizdto question3 = new Quizdto("What is the first programming language?",Arrays.asList("1.FORTRAN","2.Python","3.C++","4.C"), 1);
		Quizdto question4 = new Quizdto("Which is the biggest province of Nepal?",Arrays.asList("1.Gandaki Pradesh","2.Karnali Pradesh","3.Sudurpashchim Pradesh","4.Province No. 2"),2);
		Quizdto question5 = new Quizdto("Which is the smallest countery in the world?",Arrays.asList("1.Maldives","2.Argentina","3.Nepal","4.Vatican City"),4);
		Quizdto question6 = new Quizdto("Which is the most popular programming language?",Arrays.asList("1.C#","2.Javascript","3.Python","4.Java"),3);
		Quizdto question7 = new Quizdto("What is smallest bird in the world?",Arrays.asList("1.Peigon","2.Goldcrest","3.Bee hummingbird","4.Tit"),3);
		Quizdto question8 = new Quizdto("What is capital of Russia?",Arrays.asList("1.Moscow","2.Kazan","3.Sochi","4.Veliky Novgorod"),1);
		Quizdto question9 = new Quizdto	("Which is the hottest continent in the world?",Arrays.asList("1.Asia","2.South America","3.Africa","4.Austraila"),3);
		Quizdto question10 = new Quizdto("Who is the first Missworld?",Arrays.asList("1.Susmita Sen","2.Reita Faria","3.Karolina Bielawska ","4.Lara Dutt"),2);
		questionList.add(question1);
		questionList.add(question2);
		questionList.add(question3);
		questionList.add(question4);
		questionList.add(question5);
		questionList.add(question6);
		questionList.add(question7);
		questionList.add(question8);
		questionList.add(question9);
		questionList.add(question10);
		Collections.shuffle(questionList);
		
}
	public static void main(String[] args) {
		quiz obj1 = new quiz();
		obj1.playQuiz();
	}
	
}
