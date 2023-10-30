package com.tasks.polymorphism.media;

public class MultimediaFile {

	String title;
	float duration;
	float fileSize;

	
	
	public MultimediaFile(String title, float duration, float fileSize) {
		this.title = title;
		this.duration = duration;
		this.fileSize = fileSize;
	}



	void play() {
		System.out.println("Music playing...!");
	}



	public void displayInfo() {
		System.out.println("The title is     : " + title);
		System.out.println("The Duration is  : " + duration);
		System.out.println("The File Size is : " + fileSize);
	}

}
