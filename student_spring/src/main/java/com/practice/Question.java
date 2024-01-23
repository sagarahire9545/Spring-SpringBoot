package com.practice;

import java.util.List;

public class Question {
	private int qid;
	private String question;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public Question(int qid, String question, List<Answer> answer) {
		super();
		this.qid = qid;
		this.question = question;
		
	}
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question +  "]";
	}
	
	

}
