package com.codemanship.refactoring.assaultcourse;

import java.util.HashMap;

public class VideoLibrary {
	
	private HashMap<String, Video> videos = new HashMap<String, Video>();

	public boolean hasVideo(String title) {
		return videos.get(title) != null;
	}

	public void addVideo(Video video) {
		videos.put(video.getTitle(), video);
	}

}
