package com.javarush.games.snake;

import com.javarush.engine.cell.*;
import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject {

    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;
    GameObject headNewPos = null;

    Snake(int x, int y) {
        super(x, y);
        GameObject snPartOne = new GameObject(x, y);
        GameObject snPartTwo = new GameObject(x+1, y);
        GameObject snPartThree = new GameObject(x+2, y);

        snakeParts.add(snPartOne);
        snakeParts.add(snPartTwo);
        snakeParts.add(snPartThree);
    }

    public void draw(Game game) {
        Color textColor = Color.NONE;

        if (!isAlive) {
            textColor = Color.RED;
        } else {
            textColor = Color.BLACK;
        }
        game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, textColor, 75);
        for (int i = 1; i < snakeParts.size(); i++) {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, textColor, 75);
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        GameObject newHead = createNewHead();
        if (newHead.x < 0 || newHead.x >= SnakeGame.WIDTH || newHead.y < 0 || newHead.y >= SnakeGame.HEIGHT) {
            isAlive = false;
        } else {
            snakeParts.add(0, newHead);
            removeTail();
        }
    }

    public GameObject createNewHead() {

        if (direction == Direction.LEFT) {
            headNewPos = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        }
        if (direction == Direction.RIGHT) {
            headNewPos = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        }
        if (direction == Direction.UP) {
            headNewPos = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
        }
        if (direction == Direction.DOWN) {
            headNewPos = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        }
        return headNewPos;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size()-1);
    }
}
