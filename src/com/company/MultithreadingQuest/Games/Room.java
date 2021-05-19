package com.company.MultithreadingQuest.Games;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;
    static Room game;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    void run() {

    }

    void print() throws InterruptedException {
        if (snake.getSections().size() < 12) Thread.sleep((long)(520 - 20 * snake.getSections().size()));
        if (snake.getSections().size() < 16 && snake.getSections().size() >= 11) Thread.sleep((long)(575 - 25 * snake.getSections().size()));
        if (snake.getSections().size() >= 16 ) Thread.sleep(200);
    }

    public void sleep () {

    }

    public void createMouse() {
        mouse = new Mouse((int) (Math.random() * width), (int) (Math.random() * height));

    }

    public void eatMouse() {
        createMouse();
    }

    public static void main(String[] args) {
        Snake snake = new Snake(1, 1);
        game = new Room(10, 10, snake);
        snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

}