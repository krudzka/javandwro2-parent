package json;

import maps.Point;

import java.util.List;

/**
 * Created by RENT on 2017-03-22.
 */
public class Place {
    String name;
    String city;

    List<Point> points;

    public Place() {
    }


    public Place(String name, String city, List<Point> points) {
        this.name = name;
        this.city = city;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
