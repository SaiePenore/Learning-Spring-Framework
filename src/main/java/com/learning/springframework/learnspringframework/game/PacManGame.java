package com.learning.springframework.learnspringframework.game;

public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("run");
	}
	
	public void down() {
		System.out.println("knee down");
	}
	
	public void left() {
		System.out.println("shoot");
	}
	
	public void right() {
		System.out.println("hide");
	}

}
