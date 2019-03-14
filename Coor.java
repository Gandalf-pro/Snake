/**
 * Coor
 */
public class Coor {
    private int preprePosx;
    private int preprePosy;
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
     * @return the preprePosx
     */
    public int getPreprePosx() {
        return preprePosx;
    }

    /**
     * @param preprePosx the preprePosx to set
     */
    public void setPreprePosx(int preprePosx) {
        this.preprePosx = preprePosx;
    }

    /**
     * @return the preprePosy
     */
    public int getPreprePosy() {
        return preprePosy;
    }

    /**
     * @param preprePosy the preprePosy to set
     */
    public void setPreprePosy(int preprePosy) {
        this.preprePosy = preprePosy;
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
        this.prevPosx = 0;
        this.prevPosy = 0;
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
        this.preprePosx = this.prevPosx;
        this.preprePosy = this.prevPosy;
        this.prevx = this.x;
        this.prevy = this.y;
        this.prevPosx = posx;
        this.prevPosy = posy;
        this.x = x;
        this.posx = x * 20;
        System.out.println("x:" + this.posx + "y:" + this.posy);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return int return the y
     */
    public int getY() {
        return y; 
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.preprePosx = this.prevPosx;
        this.preprePosy = this.prevPosy;
        this.prevx = this.x;
        this.prevy = this.y;
        this.prevPosx = posx;
        this.prevPosy = posy;
        this.y = y;
        this.posy = y * 20;
        System.out.println("x:"+this.posx+"y:"+this.posy);
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