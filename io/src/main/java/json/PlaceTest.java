package json;

import maps.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-22.
 */
public class PlaceTest {
    public static void main(String[] args) {





        Point point = new Point(4,5);
        Point point1 = new Point(2,7);
        List<Point>points = new ArrayList<>();
        points.add(point);
        points.add(point1);

        Place place = new Place("house","Wrocław",points);
        getPlace(place);

    }



    public static void getPlace(Place place){

        System.out.println("{" +  "name"  +  ":" + place.getName() + ",");
//        {
//            "name":place.getName(),
//            "city":place.getCity(),
//            "points":[
//            {place.getPoints().get(0).getX();
//                place.getPoints().get(0).gety();
//                "x":
//                "y":5,
//            },
//            {
//                place.getPoints().get(1).getX();
//                place.getPoints().get(1).gety();
//            }]
//        }
    }
}
