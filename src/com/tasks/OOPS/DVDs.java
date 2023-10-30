package com.tasks.OOPS;

public class DVDs extends LibraryItem {

	private float duration;

	public DVDs(String title, int itemID, float duration) {
		super(title, itemID);
		this.duration = duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public float getDuration() {
		return duration;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Duration : " + duration);
	}
}
