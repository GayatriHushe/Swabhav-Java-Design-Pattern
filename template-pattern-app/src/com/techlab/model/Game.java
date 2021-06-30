package com.techlab.model;

public abstract class Game {
	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	public void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
