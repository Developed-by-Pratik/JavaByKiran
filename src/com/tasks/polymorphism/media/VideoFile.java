package com.tasks.polymorphism.media;

public class VideoFile extends MultimediaFile {

	int resolution;
	String subtitles;

	@Override
	void play() {
		System.out.println("Video Is Playing....!");
	}

	@Override
	public void displayInfo() {
		System.out.println("The artist is : " + resolution);
		System.out.println("The album is  : " + subtitles);
	}
	
	public VideoFile(String title, float duration, float fileSize, int resolution, String subtitles) {
		super(title, duration, fileSize);
		this.resolution = resolution;
		this.subtitles = subtitles;
	}

}
