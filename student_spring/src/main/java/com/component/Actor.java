package com.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	String name;

	@Autowired
	Movie movie;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String name, Movie movie) {
		super();
		this.name = name;
		this.movie = movie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}

}
