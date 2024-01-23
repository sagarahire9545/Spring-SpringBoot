package com.collection.ActorMovie;

public class Movie {
	
	private int mid;
	private String mName;
	public Movie() {
		super();
	}
	public Movie(int mid, String mName) {
		super();
		this.mid = mid;
		this.mName = mName;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mName=" + mName + "]";
	}
	
	

}
