package com.techlab.model;

import java.util.ArrayList;

public class Element extends StorageElement {

	private String name;
	private String value;
	private ArrayList<StorageElement> child;
	private int level;
	private String startTag;
	private String endTag;
	private StringBuilder sb=new StringBuilder();

	public Element(String name) {
		this.name=name;
		this.child=new ArrayList<StorageElement>();
		this.level=0;
		this.startTag="<"+this.name+">";
		this.endTag="</"+this.name+">";
		this.value="";
	}

	public Element(String name, String value) {
		this.name=name;
		this.value=value;
		this.child=new ArrayList<StorageElement>();
		this.level=0;
		this.startTag="<"+this.name+">"+"\n";
		this.endTag="</"+this.name+">";
	}

	public void addChild(StorageElement se) {
		se.setLevel(this.level + 1);
		child.add(se);
	}

	
	public String getValue() {
		return value;
	}

	@Override
	public String display() {
		for(int i=0;i<this.level;i++)
		{
			this.sb.append("    ");
		}
		this.sb.append(this.startTag);
		for(int i=0;i<=this.level;i++)
		{
			this.sb.append("    ");
		}
		this.sb.append(this.value);
		this.sb.append("\n");
		for (StorageElement storageElement : child) {
			this.sb.append(storageElement.display());
		}
		for (int i = 0; i < this.level; i++) {
			this.sb.append("    ");
		}
		this.sb.append(this.endTag);
		this.sb.append("\n");
		return this.sb.toString();
	}

	@Override
	public void setLevel(int level) {
		this.level=level;
	}

}
