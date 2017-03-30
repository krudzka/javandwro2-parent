package pl.jwrabel.trainings.javandwro2;

/**
 * Created by RENT on 2017-03-22.
 */
public class Pointt implements Comparable {
    private int x;
    private int y;

    public Pointt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Pointt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o.getClass() == getClass()) { //sprawdzamy czy mamy obiekt tej samej klasy
            Pointt pointt2 = (Pointt) o;
            if (x > pointt2.getX()) {
                return -1;
            } else if (x == pointt2.getX()) {
                if(y>pointt2.getY()) {
                    return -1;
                }else if(y==pointt2.getY()){
                    return  0;
                }else{
                    return 0;
                }
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}
