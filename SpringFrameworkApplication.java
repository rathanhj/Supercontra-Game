package com.durga.springframework1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.durga.springframework1.game.GameRunner;
import com.durga.springframework1.game.Mariogame;
import com.durga.springframework1.game.Supercontra;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(SpringFrameworkApplication.class, args);
		
		GameRunner runner = Context.getBean(GameRunner.class);
		
		//Mariogame game = new Mariogame();
		//Supercontra game = new Supercontra();
		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
