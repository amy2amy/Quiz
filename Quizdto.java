package com.nextstep.quizapplication.quiz;

import java.util.List;

public class Quizdto {
	String questions;
	List<String>answerlist;
	int correctanswer;
	String name;
	int score;
	 
	public Quizdto(String questions,List<String>answerlist,int correctanswer) {
		this.questions = questions;
		this.answerlist = answerlist;
		this.correctanswer = correctanswer;
				
	}
	public Quizdto(String name,int score) {
		this.name= name;
		this.score = score;
	}

}
