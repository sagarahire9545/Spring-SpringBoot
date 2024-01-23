package com.collection.userdefine;

import java.util.Iterator;
import java.util.List;



public class Question {

	private int qid;
	private String qname;
	 private List<Answer> answer;
	public Question() {
		super();
	}
	public Question(int qid, String qname, List<Answer> answer) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", answer=" + answer + "]";
	}
	 
	void display()
	{
		System.out.println(qid+" "+qname);
		Iterator<Answer> itr =answer.iterator();
		while (itr.hasNext()) {
			
			Answer a=itr.next();
			System.out.println(a.getAid());
			
		}
	}
	 
}
