import java.util.ArrayList;

public class Snake {
    private ArrayList<Block> body;
    private Direction dir;
    private boolean hasMoved;
    public boolean processed;

    /**
     * @return the hasMoved
     */
    public boolean isHasMoved() {
        return hasMoved;
    }

    /**
     * @param hasMoved the hasMoved to set
     */
    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    /**
     * @return the dir
     */
    public Direction getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(Direction dir) {
        this.dir = dir;
    }

    /**
     * @return ArrayList<Block> return the body
     */
    public ArrayList<Block> getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(ArrayList<Block> body) {
        this.body = body;
    }

    public void snakeAdd() {
        int x = this.body.get(this.body.size() - 1).getCoordinate().getPrevx();
        int y = this.body.get(this.body.size() - 1).getCoordinate().getPrevy();
        Block b = new Block(x, y);
        body.add(b);
    }

    public void moveBody() {

        if (body.size() == 3) {
            System.out.println("hello");
        }
        for (int i = 1; i < body.size(); i++) {
            this.body.get(i).getCoordinate().setPrevCor();
            this.body.get(i).getCoordinate().setPrevPoses();
            this.body.get(i).getCoordinate().setX(this.body.get(i - 1).getCoordinate().getPrevx());
            this.body.get(i).getCoordinate().setY(this.body.get(i - 1).getCoordinate().getPrevy());
        }
    }

    public boolean isLost() {
        for (int i = 1; i < this.body.size(); i++) {
            if ((this.body.get(0).getCoordinate().getPosx() == this.body.get(i).getCoordinate().getPosx()
                    && this.body.get(0).getCoordinate().getPosy() == this.body.get(i).getCoordinate().getPosy())) {
                return true;
            }
        }
        return false;
    }

    public void moveSnakeHead(Window window) {
        this.body.get(0).getCoordinate().setPrevCor();
        this.body.get(0).getCoordinate().setPrevPoses();
        int wW = window.getWidth() / 20;
        int wH = window.getHeight() / 20;
        switch (dir) {
        case north:
            if ((this.body.get(0).getCoordinate().getY() - 1) < 0) {
                this.body.get(0).getCoordinate().setY(wH);
            } else
                this.body.get(0).getCoordinate().setY((this.body.get(0).getCoordinate().getY() - 1));
            hasMoved = true;
            break;
        case east:
            this.body.get(0).getCoordinate().setX((this.body.get(0).getCoordinate().getX() + 1) % wW);
            hasMoved = true;
            break;
        case south:
            this.body.get(0).getCoordinate().setY((this.body.get(0).getCoordinate().getY() + 1) % wH);
            hasMoved = true;
            break;
        case west:
            if ((this.body.get(0).getCoordinate().getX() - 1) < 0) {
                this.body.get(0).getCoordinate().setX(wW);
            } else
                this.body.get(0).getCoordinate().setX((this.body.get(0).getCoordinate().getX() - 1));
            hasMoved = true;
            break;

        default:
            break;
        }
        if (isLost()) {
            System.out.println("You Lost");
            System.exit(1);
        }
    }

    public Snake() {
        processed = false;
        hasMoved = false;
        dir = Direction.noting;
        body = new ArrayList<Block>();
        body.add(new Block());
        body.get(0).getCoordinate().setX(0);
        body.get(0).getCoordinate().setY(0);
    }

}