import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * KeyThing
 */
public class KeyThing implements KeyListener {
    private Snake snake;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * @return the snake
     */
    public Snake getSnake() {
        return snake;
    }

    /**
     * @param snake the snake to set
     */
    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
        case 'w':
            snake.setDir(Direction.north);
            break;

        case 'a':
            snake.setDir(Direction.west);
            break;

        case 's':
            snake.setDir(Direction.south);
            break;
        case 'd':
            snake.setDir(Direction.east);
            break;
        case ' ':
            System.out.println("Space");
            break;

        default:
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}