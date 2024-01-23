package com.component;

import org.springframework.stereotype.Component;

@Component
public class Movie {

	String mName;

	public Movie() {
		super();
	}

	public Movie(String mName) {
		super();
		this.mName = mName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	@Override
	public String toString() {
		return "Movie [mName=" + mName + "]";
	}

}
