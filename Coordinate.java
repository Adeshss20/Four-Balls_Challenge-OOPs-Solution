public class Coordinate {
    int xcoordinate;
    int ycoordinate;

    public Coordinate(int xcoordinate, int ycoordinate) {
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
    }
    public int getXcoordinate() {
        return xcoordinate;
    }

    public int getYcoordinate() {
        return ycoordinate;
    }

    public void updateXcoordinate(int factor) {
        xcoordinate+=factor;
    }

    public void updateYcoordinate(int factor) {
        ycoordinate+=factor;
    }
}
