import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

/**
 * Window
 */
public class Window extends JFrame {
    private KeyThing keyThing;
    private Canvas canvas;
    private int space;
    private int bCount;
    private Block fruit;
    int count;

    public Graphics getGraphicsObj() {
        return canvas.getGraphics();
    }

    /**
     * @return the canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * @param canvas the canvas to set
     */
    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * @return KeyThing return the keyThing
     */
    public KeyThing getKeyThing() {
        return keyThing;
    }

    /**
     * @param keyThing the keyThing to set
     */
    public void setKeyThing(KeyThing keyThing) {
        this.keyThing = keyThing;
    }

    private void frameSettings(String name) {
        this.setName(name);
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void canvasSettings() {
        canvas = new Canvas();
        this.add(canvas);
        canvas.setBackground(Color.BLACK);
        canvas.addKeyListener(keyThing);
    }

    public void clearPrevBlock(Snake s) {
        if (!s.isHasMoved()) {
            System.out.println("Dit not clear");
            return;
        }
        Graphics g = canvas.getGraphics();
        if (g == null) {
            System.out.println("Graphics objects is null");
            return;
        }
        if (s.getBody().size() == 2) {
            count += 1;
            if (count == 4) {
                int bam = 10;
            }
        }
        int x = s.getBody().get(s.getBody().size() - 1).getCoordinate().getPrevPosx();
        int y = s.getBody().get(s.getBody().size() - 1).getCoordinate().getPrevPosy();
        g.setColor(Color.BLACK);
        g.clearRect(x, y, space, space);

    }

    public void clearScreen(Snake s) {
        if (!s.isHasMoved()) {
            System.out.println("Dit not clear");
            return;
        }
        Graphics g = canvas.getGraphics();
        if (g == null) {
            System.out.println("Graphics objects is null");
            return;
        }
        g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }


    public void drawBlock(Coor cor, Color c) {
        Graphics g = canvas.getGraphics();
        if (g == null) {
            System.out.println("Graphics objects is null");
            return;
        }
        g.setColor(c);
        g.fillRect(cor.getPosx(), cor.getPosy(), space, space);
    }

    public void drawLines() {
        Graphics g = canvas.getGraphics();
        if (g == null) {
            System.out.println("Graphics objects is null");
            return;
        }
        g.setColor(Color.white);
        for (int i = 0; i < bCount + 1; i++) {
            g.drawLine(0, space * i, bCount * space, space * i);
            g.drawLine(space * i, 0, space * i, space * bCount);
        }
        g.dispose();
    }

    public Window(String name, KeyThing kt) {
        count = 0;
        space = 20;
        bCount = 10;
        this.keyThing = kt;
        frameSettings(name);
        canvasSettings();
        this.setVisible(true);

    }

    public void drawFruit() {
        Graphics g = canvas.getGraphics();
        if (g == null || fruit == null) {
            return;
        }
        g.setColor(Color.RED);
        g.drawLine(fruit.getCoordinate().getPosx() + 1, fruit.getCoordinate().getPosy() + 1,
                fruit.getCoordinate().getPosx() - 1 + space, fruit.getCoordinate().getPosy() + space - 1);

        g.drawLine(fruit.getCoordinate().getPosx() + space - 1, fruit.getCoordinate().getPosy() + 1,
                fruit.getCoordinate().getPosx() + 1, fruit.getCoordinate().getPosy() + space - 1);

        g.dispose();
    }

    /**
     * @return Block return the fruit
     */
    public Block getFruit() {
        return fruit;
    }

    /**
     * @param fruit the fruit to set
     */
    public void setFruit(Block fruit) {
        this.fruit = fruit;
    }

}