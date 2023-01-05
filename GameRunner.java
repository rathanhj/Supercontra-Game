package com.durga.springframework1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	public GamingConsole game;
	@Autowired
	public GameRunner(GamingConsole game) {
		this.game=game;		
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
