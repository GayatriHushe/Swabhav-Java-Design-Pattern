package com.techlab.model;

public class ProxyImage implements IImage {

	private RealImage realImage;
	private String filename;

	public ProxyImage(String fileName) {
		this.filename=fileName;
	}
	
	@Override
	public void display() {
		
		if(realImage==null)
			realImage=new RealImage(filename);
		realImage.display();
	}

}
