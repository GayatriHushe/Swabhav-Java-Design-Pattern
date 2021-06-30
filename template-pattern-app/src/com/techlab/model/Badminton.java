package com.techlab.model;

public class Badminton extends Game{
	@Override
	public void initialize() {
		System.out.println("Badminton Initialized");
	}
	@Override
	public void startPlay() {
		System.out.println("Badminton Started");
	}
	@Override
	public void endPlay() {
		System.out.println("Badminton Ended");
	}
}
