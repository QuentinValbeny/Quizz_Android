package com.valbeny.quizz;

public class Currency {
	public int docId;
	public String question;
	public String answer1;
	public String answer2;
	public String answer3;

	public Currency(int docId, String question, String answer1, String answer2, String answer3) {
		this.docId = docId;
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
	}
}
