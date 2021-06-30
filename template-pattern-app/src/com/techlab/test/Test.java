package com.techlab.test;

import com.techlab.model.Badminton;
import com.techlab.model.Game;
import com.techlab.model.Kabaddi;

public class Test {
	public static void main(String[] args) {
		Game game=new Badminton();
		game.play();
		
		System.out.println();
		game=new Kabaddi();
		game.play();
	}
}
