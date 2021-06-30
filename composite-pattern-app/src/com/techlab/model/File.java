package com.techlab.model;

public class File implements IStorageItem {
	private String name;
	private int size;
	private String type;
	
	public File(String name,int size, String type) {
		this.name=name;
		this.size=size;
		this.type=type;
	}
	
	@Override
	public String toString() {
		return "File [name=" + name + ", size=" + size + ", type=" + type + "]";
	}

	@Override
	public void display() {
		System.out.println(this);
		
	}

}
