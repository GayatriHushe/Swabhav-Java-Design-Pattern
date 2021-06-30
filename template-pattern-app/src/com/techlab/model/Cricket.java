package com.techlab.model;

public class Cricket extends Game{
	@Override
	public void initialize() {
		System.out.println("Cricket Initialized");
	}
	@Override
	public void startPlay() {
		System.out.println("Cricket Started");
	}
	@Override
	public void endPlay() {
		System.out.println("Cricket Ended");
	}
}
