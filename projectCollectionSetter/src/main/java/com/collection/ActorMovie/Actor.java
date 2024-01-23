package com.collection.ActorMovie;

import java.util.Iterator;
import java.util.List;

public class Actor {

	private int aid;
	private String aname;
	
	List<Movie> movie;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(int aid, String aname, List<Movie> movie) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.movie = movie;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", aname=" + aname + ", movie=" + movie + "]";
	}
	
	

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(aid+" "+aname);
		Iterator<Movie> itr =movie.iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
	}
		
	}
	

