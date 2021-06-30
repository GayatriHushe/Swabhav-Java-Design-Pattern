package com.techlab.model;

public class Kabaddi extends Game{
	@Override
	public void initialize() {
		System.out.println("Kabaddi Initialized");
	}
	@Override
	public void startPlay() {
		System.out.println("Kabaddi Started");
	}
	@Override
	public void endPlay() {
		System.out.println("Kabaddi Ended");
	}
}
