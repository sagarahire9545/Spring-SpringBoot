package com.springcore.collection;

import java.util.List;

public class QuetsionAns {

	private int qId;
	private String question;
	private List<String> answer;

	public QuetsionAns() {
		super();
	}

	public QuetsionAns(int qId, String question, List<String> answer) {
		super();
		this.qId = qId;
		this.question = question;
		this.answer = answer;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswer() {
		return answer;
	}

	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuetsionAns [qId=" + qId + ", question=" + question + ", answer=" + answer + "]";
	}

}
