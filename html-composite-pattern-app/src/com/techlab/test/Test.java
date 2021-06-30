package com.techlab.test;

import java.io.FileWriter;
import java.io.IOException;

import com.techlab.model.Element;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("src/com/techlab/model/index.html");
		
		Element html=new Element("html");
		
		Element head=new Element("head");
		html.addChild(head);
		
		Element title=new Element("title","This is my Title");
		head.addChild(title);
		
		Element body=new Element("body");
		html.addChild(body);
		
		Element para1=new Element("p","This is my paragraph");
		body.addChild(para1);
		
		Element para2=new Element("p","This is my paragraph");
		body.addChild(para2);
				
		String data="<!DOCTYPE html>"+"\n"+html.display();
		System.out.println(data);
		//fw.write(data);
		//fw.close();
		
	}

}
