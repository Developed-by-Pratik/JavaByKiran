package com.tasks.polymorphism.media;

public class Player extends AudioFile {

	public Player(String title, float duration, float fileSize, String artist, String album) {
		super(title, duration, fileSize, artist, album);
	}

	public static void main(String[] args) {
		
		MultimediaFile m = new MultimediaFile("A1",12.4f,7.8f);
		m.displayInfo();
		m.play();
		
		System.out.println("\n");
		
		AudioFile a = new AudioFile(null, 0, 0, "A1", "Album");
		a.displayInfo();
		a.play();
		
		System.out.println("\n");
		
		VideoFile v = new VideoFile(null, 0, 0, 720, "Subtitles");
		v.displayInfo();
		v.play();
		
	}
	
}
