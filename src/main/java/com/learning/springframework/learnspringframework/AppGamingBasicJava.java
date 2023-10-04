package com.learning.springframework.learnspringframework;

import com.learning.springframework.learnspringframework.game.GameRunner;
import com.learning.springframework.learnspringframework.game.MarioGame;
import com.learning.springframework.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
	
	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}
}
