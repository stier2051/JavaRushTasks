package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
        public static final int WIDTH = 15;
        public static final int HEIGHT = 15;

        private Snake snake;
        private int turnDelay;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        turnDelay = 300;
        snake = new Snake(WIDTH/2, HEIGHT/2);
        drawScene();
        setTurnTimer(turnDelay);
    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y <HEIGHT; y++) {
                setCellValueEx(x, y, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
    }

    @Override
    public void onTurn(int step) {
        snake.move();
        drawScene();
    }
}
