/**
 * Coor
 */
public class Coor {
    private int prevPosx;
    private int prevPosy;
    private int posx;
    private int posy;
    private int prevx;
    private int prevy;
    private int x;
    private int y;

    public Coor() {

    }

   
  
    /**
     * @return the prevx
     */
    public int getPrevx() {
        return prevx;
    }

    /**
     * @param prevx the prevx to set
     */
    public void setPrevx(int prevx) {
        this.prevx = prevx;
    }

    /**
     * @return the prevy
     */
    public int getPrevy() {
        return prevy;
    }

    /**
     * @param prevy the prevy to set
     */
    public void setPrevy(int prevy) {
        this.prevy = prevy;
    }

    /**
     * @return the prevPosx
     */
    public int getPrevPosx() {
        return prevPosx;
    }

    /**
     * @param prevPosx the prevPosx to set
     */
    public void setPrevPosx(int prevPosx) {
        this.prevPosx = prevPosx;
    }

    /**
     * @return the prevPosy
     */
    public int getPrevPosy() {
        return prevPosy;
    }

    /**
     * @param prevPosy the prevPosy to set
     */
    public void setPrevPosy(int prevPosy) {
        this.prevPosy = prevPosy;
    }

    public Coor(int x, int y) {
        this.x = x;
        this.y = y;
        this.setCor();
    }

    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
        this.setCor();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        this.setCor();
    }

    /**
     * @return int return the y
     */
    public int getY() {
        return y;
    }

    public void setCor() {
        this.posx = this.x * 20;
        this.posy = this.y * 20;
    }
    

    public void setPrevCor() {
        this.prevx = this.x;
        this.prevy = this.y;
    }


    public void setPrevPoses() {
        this.prevPosx = this.posx;
        this.prevPosy = this.posy;
    }


    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
        this.setCor();
    }

    /**
     * @return int return the posx
     */
    public int getPosx() {
        return posx;
    }

    /**
     * @param posx the posx to set
     */
    public void setPosx(int posx) {
        this.posx = posx;
    }

    /**
     * @return int return the posy
     */
    public int getPosy() {
        return posy;
    }

    /**
     * @param posy the posy to set
     */
    public void setPosy(int posy) {
        this.posy = posy;
    }

}