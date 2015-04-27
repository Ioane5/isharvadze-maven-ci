package com.ioane.isharvadze_maven_ci;

public class Car {

	private String mName;
	private String mMark;
	private int mMaxSpeed;
	private int mMaxReverseSpeed;
	
	
	
	
	public Car(String mName, String mMark, int mMaxSpeed, int mMaxReverseSpeed) {
		super();
		this.mName = mName;
		this.mMark = mMark;
		this.mMaxSpeed = mMaxSpeed;
		this.mMaxReverseSpeed = mMaxReverseSpeed;
	}
	
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMark() {
		return mMark;
	}
	public void setmMark(String mMark) {
		this.mMark = mMark;
	}
	public int getmMaxSpeed() {
		return mMaxSpeed;
	}
	public void setmMaxSpeed(int mMaxSpeed) {
		this.mMaxSpeed = mMaxSpeed;
	}
	public int getmMaxReverseSpeed() {
		return mMaxReverseSpeed;
	}
	public void setmMaxReverseSpeed(int mMaxReverseSpeed) {
		this.mMaxReverseSpeed = mMaxReverseSpeed;
	}
	
	
}
