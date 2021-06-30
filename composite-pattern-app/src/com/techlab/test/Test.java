package com.techlab.test;

import com.techlab.model.File;
import com.techlab.model.Folder;

public class Test {

	public static void main(String[] args) {
		Folder root=new Folder("movies");
		root.addChild(new File("abc",1,"mp4"));
		root.addChild(new File("xyz",2,"mp4"));
		Folder comedyMovies=new Folder("comedy movies");
		root.addChild(comedyMovies);
		comedyMovies.addChild(new File("mno",2,"mp4"));
		root.display();
	}
}
