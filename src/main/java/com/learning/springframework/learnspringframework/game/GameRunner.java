package com.learning.springframework.learnspringframework.game;

public class GameRunner {
	
	private GamingConsole game;
	private GamingConsole game1;
	public GameRunner(GamingConsole game1) {
		this.game1 = game1;
	}
	
	public void run() {
		
		System.out.println("Running game: " +game1);
		
		game1.up();
		game1.down();
		game1.left();
		game1.right();
		
	}

}
