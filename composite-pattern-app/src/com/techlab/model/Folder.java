package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Folder  implements IStorageItem{

	private String name;
	private List<IStorageItem> children=new ArrayList<IStorageItem>();
	
	
	public Folder(String name) {
		this.name=name;
	}
	
	public void addChild(IStorageItem item) {
		children.add(item);
	}
	
	@Override
	public void display() {
		
	System.out.println(this);
	}

	@Override
	public String toString() {
		return "Folder [name=" + name + ", children=" + children + "]";
	}

	
}
