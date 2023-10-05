package com.learning.springframework.learnspringframework;

import com.learning.springframework.learnspringframework.game.GameRunner;
import com.learning.springframework.learnspringframework.game.MarioGame;
import com.learning.springframework.learnspringframework.game.PacManGame;
import com.learning.springframework.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
	
	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}

/*Coupling: how much work is involved in changing something?*/