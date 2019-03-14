/**
 * Block
 */
public class Block {
    private Coor coordinate;
    private boolean checked;

    /**
     * @return Coor return the coordinate
     */
    public Coor getCoordinate() {
        return coordinate;
    }

    /**
     * @param coordinate the coordinate to set
     */
    public void setCoordinate(Coor coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * @return boolean return the checked
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * @param checked the checked to set
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Block() {
        checked = false;
        coordinate = new Coor();
    }

}