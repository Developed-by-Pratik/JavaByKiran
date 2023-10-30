package com.tasks.polymorphism.media;

public class AudioFile extends MultimediaFile {

	String artist;
	String album;
	
	@Override
	void play() {
		System.out.println("Audio is playing...!");
	}

	@Override
	public void displayInfo() {
		System.out.println("The artist is : " + artist);
		System.out.println("The album is  : " + album);
	}
	
	public AudioFile(String title, float duration, float fileSize, String artist, String album) {
		super(title, duration, fileSize);
		this.artist = artist;
		this.album = album;
	}
	
}
