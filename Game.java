import java.awt.Color;
import java.util.Random;

/**
 * Game
 */
public class Game {
    private Window window;
    private Snake snake;
    private KeyThing keyThing;

    public boolean hasEaten() {
        if ((snake.getBody().get(0).getCoordinate().getX() == window.getFruit().getCoordinate().getX())
                && (snake.getBody().get(0).getCoordinate().getY() == window.getFruit().getCoordinate().getY())) {
            return true;
        }
        return false;
    }

    public void eat() {
        if (hasEaten()) {
            window.setFruit(null);
            snake.snakeAdd();
            putRandomFruit();
            snake.setHasMoved(false);

        }
    }

    public void putRandomFruit() {
        Random r = new Random();
        int putx = r.nextInt(window.getCanvas().getWidth() / 20);
        int puty = r.nextInt(window.getCanvas().getHeight() / 20);
        Block b = new Block();
        b.getCoordinate().setX(putx);
        b.getCoordinate().setY(puty);
        window.setFruit(b);
    }

    private void drawSnake() {
        window.drawBlock(snake.getBody().get(0).getCoordinate(), new Color(0, 255, 255));
        for (int i = 1; i < snake.getBody().size(); i++) {
            window.drawBlock(snake.getBody().get(i).getCoordinate(), new Color(0, 255, 0));
        }
    }

    private void move() {
        snake.moveSnakeHead();
        snake.moveBody();
    }

    // starts the game
    public void start() {
        render();
        while (true) {
            long nanostart = System.nanoTime();

            move();
            eat();
            render();
            long wait = (System.nanoTime() - nanostart);
            try {
                Thread.sleep(380 - (wait / 1000000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            window.clearScreen(snake);
        }
    }

    // render
    public void render() {
        //window.clearPrevBlock(snake);
        System.out.println("rendering");
        drawSnake();
        window.drawFruit();
        System.out.println(snake.getBody().size());
        // window.drawLines();

    }

    // setup
    public Game() {
        snake = new Snake();
        keyThing = new KeyThing();
        keyThing.setSnake(snake);
        window = new Window("Snake", keyThing);
        putRandomFruit();
    }
}